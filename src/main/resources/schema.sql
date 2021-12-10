-- ORGANIZATION
create sequence PROJECT_ID_SEQ
/

create table PROJECT
(
    ID          NUMBER(38)                                               not null primary key,
    NAME        VARCHAR2(255)                                            not null
        constraint PROJECT_NAME_UK unique,
    DESCRIPTION VARCHAR2(255),
    CREATED_AT  TIMESTAMP(6) WITH TIME ZONE default CURRENT_TIMESTAMP(6) not null,
    UPDATED_AT  TIMESTAMP(6) WITH TIME ZONE,
    DELETED_AT  TIMESTAMP(6) WITH TIME ZONE,
    VERSION     NUMBER(38)                  default 0                    not null
)
/

create or replace trigger PROJECT_ID_TRG
    before insert
    on PROJECT
    for each row
begin
    if :new.id is null then
        select PROJECT_ID_SEQ.nextval into :new.id from dual;
    end if;
end;
/

-- PAGE
create sequence PAGE_ID_SEQ
/

create table PAGE
(
    ID          NUMBER(38)                                               not null primary key,
    NAME        VARCHAR2(255)                                            not null,
    DESCRIPTION VARCHAR2(255),
    ACCESS_TYPE VARCHAR2(10)                default 'closed'             not null CHECK (ACCESS_TYPE IN ('open', 'closed') ),
    AUDIENCE    VARCHAR2(10)                default 'internal'           not null CHECK (AUDIENCE IN ('internal', 'external') ),
    PUBLISHED   NUMBER(1)                   default 0                    not null CHECK (PUBLISHED in (1, 0)),
    CREATED_AT  TIMESTAMP(6) WITH TIME ZONE default CURRENT_TIMESTAMP(6) not null,
    UPDATED_AT  TIMESTAMP(6) WITH TIME ZONE,
    DELETED_AT  TIMESTAMP(6) WITH TIME ZONE,
    PROJECT_ID  NUMBER(38)                                               not null references PROJECT,
    VERSION     NUMBER(38)                  default 0                    not null,
    CONSTRAINT PAGE_NAME_PROJECT_ID_UK unique (NAME, PROJECT_ID)
)
/

create or replace trigger PAGE_ID_TRG
    before insert
    on PAGE
    for each row
begin
    if :new.id is null then
        select PAGE_ID_SEQ.nextval into :new.id from dual;
    end if;
end;
/

-- COMPONENT_GROUP
create sequence COMPONENT_GROUP_ID_SEQ
/

create table COMPONENT_GROUP
(
    ID         NUMBER(38)             not null primary key,
    NAME       VARCHAR2(255)          not null
        constraint COMPONENT_GROUP_NAME_UK unique,
    CREATED_AT TIMESTAMP(6),
    UPDATED_AT TIMESTAMP(6),
    DELETED_AT TIMESTAMP(6) WITH TIME ZONE,
    "order"    NUMBER(10) default '0' not null,
    COLLAPSED  NUMBER(1)  default 1   not null CHECK (COLLAPSED in (1, 0)),
    VERSION    NUMBER(38) default 0   not null
)
/

create or replace trigger COMPONENT_GROUP_ID_TRG
    before insert
    on COMPONENT_GROUP
    for each row
begin
    if :new.id is null then
        select COMPONENT_GROUP_ID_SEQ.nextval into :new.id from dual;
    end if;
end;
/

-- COMPONENT
create sequence COMPONENT_ID_SEQ
/

create table COMPONENT
(
    ID          NUMBER(38)                                               not null primary key,
    NAME        VARCHAR2(255)                                            not null,
    DESCRIPTION VARCHAR2(255),
    STATUS      NUMBER(10)                                               not null,
    "order"     NUMBER(10),
    CREATED_AT  TIMESTAMP(6) WITH TIME ZONE default CURRENT_TIMESTAMP(6) not null,
    UPDATED_AT  TIMESTAMP(6) WITH TIME ZONE,
    DELETED_AT  TIMESTAMP(6) WITH TIME ZONE,
    ENABLED     NUMBER(1)                   default 0                    not null CHECK (ENABLED in (1, 0)),
    PAGE_ID     NUMBER(38)                                               not null references PAGE,
    VERSION     NUMBER(38)                  default 0                    not null,
    CONSTRAINT COMPONENT_NAME_PAGE_ID_UK unique (NAME, PAGE_ID)
)
/

create or replace trigger COMPONENT_ID_TRG
    before insert
    on COMPONENT
    for each row
begin
    if :new.id is null then
        select COMPONENT_ID_SEQ.nextval into :new.id from dual;
    end if;
end;
/

--COMPONENT_COMPONENT_GROUP
create table COMPONENT_COMPONENT_GROUP
(
    COMPONENT_ID       NUMBER(38) references COMPONENT not null,
    COMPONENT_GROUP_ID NUMBER(38) references COMPONENT_GROUP,
    CONSTRAINT COMPONENT_COMPONENT_GROUP_UK unique (COMPONENT_ID, COMPONENT_GROUP_ID)
)
/

--INCIDENT
create sequence INCIDENT_ID_SEQ
/

create table INCIDENT
(
    ID         NUMBER(38)                                               not null primary key,
    NAME       VARCHAR2(255)                                            not null,
    STATUS     NUMBER(10)                                               not null,
    MESSAGE    CLOB                                                     not null,
    CREATED_AT TIMESTAMP(6) WITH TIME ZONE default CURRENT_TIMESTAMP(6) not null,
    UPDATED_AT TIMESTAMP(6) WITH TIME ZONE,
    DELETED_AT TIMESTAMP(6) WITH TIME ZONE,
    VISIBLE    NUMBER(1)                   default 0                    not null CHECK (VISIBLE in (1, 0)),
    VERSION    NUMBER(38)                  default 0                    not null
)
/

create or replace trigger INCIDENT_ID_TRG
    before insert
    on INCIDENT
    for each row
begin
    if :new.id is null then
        select INCIDENT_ID_SEQ.nextval into :new.id from dual;
    end if;
end;
/

--SCHEDULED_MAINTENANCE
create sequence SCHEDULED_MAINTENANCE_ID_SEQ
/

create table SCHEDULED_MAINTENANCE
(
    ID           NUMBER(38)                                               not null primary key,
    NAME         VARCHAR2(255)                                            not null,
    STATUS       NUMBER(10)                                               not null,
    MESSAGE      CLOB                                                     not null,
    CREATED_AT   TIMESTAMP(6) WITH TIME ZONE default CURRENT_TIMESTAMP(6) not null,
    UPDATED_AT   TIMESTAMP(6) WITH TIME ZONE,
    DELETED_AT   TIMESTAMP(6) WITH TIME ZONE,
    SCHEDULED_AT TIMESTAMP(6) WITH TIME ZONE default CURRENT_TIMESTAMP(6) not null,
    VISIBLE      NUMBER(1)                   default 0                    not null CHECK (VISIBLE in (1, 0)),
    VERSION      NUMBER(38)                  default 0                    not null
)
/

create or replace trigger SCHEDULED_MAINTENANCE_ID_TRG
    before insert
    on SCHEDULED_MAINTENANCE
    for each row
begin
    if :new.id is null then
        select SCHEDULED_MAINTENANCE_ID_SEQ.nextval into :new.id from dual;
    end if;
end;
/

-- COMPONENT_INCIDENT
create table COMPONENT_INCIDENT
(
    COMPONENT_ID NUMBER(38) references COMPONENT not null,
    INCIDENT_ID  NUMBER(38) references INCIDENT  not null,
    CONSTRAINT COMPONENT_INCIDENT_UK unique (COMPONENT_ID, INCIDENT_ID)
)
/

-- COMPONENT_SCHEDULED_MAINTENANCE
create table COMPONENT_SCHEDULED_MAINTENANCE
(
    COMPONENT_ID             NUMBER(38) references COMPONENT             not null,
    SCHEDULED_MAINTENANCE_ID NUMBER(38) references SCHEDULED_MAINTENANCE not null,
    CONSTRAINT COMPONENT_SCHEDULED_MAINTENANCE_UK unique (COMPONENT_ID, SCHEDULED_MAINTENANCE_ID)
)
/

-- TAG
create sequence TAG_ID_SEQ
/

create table TAG
(
    ID         NUMBER(38)                                               not null primary key,
    NAME       VARCHAR2(255)                                            not null,
    CREATED_AT TIMESTAMP(6) WITH TIME ZONE default CURRENT_TIMESTAMP(6) not null,
    UPDATED_AT TIMESTAMP(6) WITH TIME ZONE,
    DELETED_AT TIMESTAMP(6) WITH TIME ZONE,
    VERSION    NUMBER(38)                  default 0                    not null
)
/

create or replace trigger TAG_ID_TRG
    before insert
    on TAG
    for each row
begin
    if :new.id is null then
        select TAG_ID_SEQ.nextval into :new.id from dual;
    end if;
end;
/

-- COMPONENT_TAG
create table COMPONENT_TAG
(
    COMPONENT_ID NUMBER(38) references COMPONENT not null,
    TAG_ID       NUMBER(38) references TAG       not null,
    CONSTRAINT COMPONENT_TAG_UK unique (COMPONENT_ID, TAG_ID)
)
/

-- INCIDENT_TAG
create table INCIDENT_TAG
(
    INCIDENT_ID NUMBER(38) references INCIDENT not null,
    TAG_ID      NUMBER(38) references TAG      not null,
    CONSTRAINT INCIDENT_TAG_UK unique (INCIDENT_ID, TAG_ID)
)
/

-- SCHEDULED_MAINTENANCE_TAG
create table SCHEDULED_MAINTENANCE_TAG
(
    SCHEDULED_MAINTENANCE_ID NUMBER(38) references SCHEDULED_MAINTENANCE not null,
    TAG_ID                   NUMBER(38) references TAG                   not null,
    CONSTRAINT SCHEDULED_MAINTENANCE_TAG_UK unique (SCHEDULED_MAINTENANCE_ID, TAG_ID)
)
/

-- PAGE_TAG
create table PAGE_TAG
(
    PAGE_ID NUMBER(38) references PAGE not null,
    TAG_ID  NUMBER(38) references TAG  not null,
    CONSTRAINT PAGE_TAG_UK unique (PAGE_ID, TAG_ID)
)
/

-- PROJECT_TAG
create table PROJECT_TAG
(
    PROJECT_ID NUMBER(38) references PROJECT not null,
    TAG_ID     NUMBER(38) references TAG     not null,
    CONSTRAINT PROJECT_TAG_UK unique (PROJECT_ID, TAG_ID)
)
/

-- SUBSCRIBER
create sequence SUBSCRIBER_ID_SEQ
/

create table SUBSCRIBER
(
    ID          NUMBER(38)                                               not null primary key,
    EMAIL       VARCHAR2(255)                                            not null
        constraint SUBSCRIBER_EMAIL_UK unique,
    VERIFY_CODE VARCHAR2(255)                                            not null,
    CREATED_AT  TIMESTAMP(6) WITH TIME ZONE default CURRENT_TIMESTAMP(6) not null,
    UPDATED_AT  TIMESTAMP(6) WITH TIME ZONE,
    DELETED_AT  TIMESTAMP(6) WITH TIME ZONE,
    VERSION     NUMBER(38)                  default 0                    not null
)
/

create or replace trigger SUBSCRIBER_ID_TRG
    before insert
    on SUBSCRIBER
    for each row
begin
    if :new.id is null then
        select SUBSCRIBER_ID_SEQ.nextval into :new.id from dual;
    end if;
end;
/

-- COMPONENT_SUBSCRIBER
create table COMPONENT_SUBSCRIBER
(
    COMPONENT_ID  NUMBER(38) references COMPONENT  not null,
    SUBSCRIBER_ID NUMBER(38) references SUBSCRIBER not null,
    CONSTRAINT COMPONENT_SUBSCRIBER_UK unique (COMPONENT_ID, SUBSCRIBER_ID)
)
/

-- USER
create sequence APP_USER_ID_SEQ
/

create table APP_USER
(
    ID             NUMBER(38)                                               not null primary key,
    USERNAME       VARCHAR2(255)                                            not null
        constraint USER_USERNAME_UK unique,
    "PASSWORD"     VARCHAR2(255)                                            not null,
    REMEMBER_TOKEN VARCHAR2(100),
    EMAIL          VARCHAR2(255)                                            not null
        constraint USER_EMAIL_UK unique,
    API_KEY        VARCHAR2(255)                                            not null
        constraint USER_API_KEY_UK unique,
    ACTIVE         NUMBER(1)                   default 0                    not null CHECK (ACTIVE in (1, 0)),
    CREATED_AT     TIMESTAMP(6) WITH TIME ZONE default CURRENT_TIMESTAMP(6) not null,
    UPDATED_AT     TIMESTAMP(6) WITH TIME ZONE,
    DELETED_AT     TIMESTAMP(6) WITH TIME ZONE,
    VERSION        NUMBER(38)                  default 0                    not null
)
/

create or replace trigger APP_USER_ID_TRG
    before insert
    on APP_USER
    for each row
begin
    if :new.id is null then
        select APP_USER_ID_SEQ.nextval into :new.id from dual;
    end if;
end;
/

-- ENTITLEMENT
create table ENTITLEMENT
(
    ID         NUMBER(38)                                               not null primary key,
    NAME       VARCHAR2(255)                                            not null
        constraint ENTITLEMENT_NAME_UK unique,
    CREATED_AT TIMESTAMP(6) WITH TIME ZONE default CURRENT_TIMESTAMP(6) not null,
    UPDATED_AT TIMESTAMP(6) WITH TIME ZONE,
    DELETED_AT TIMESTAMP(6) WITH TIME ZONE,
    VERSION    NUMBER(38)                  default 0                    not null
)
/

-- USER_ENTITLEMENT
create table APP_USER_ENTITLEMENT
(
    USER_ID        NUMBER(38) references APP_USER    not null,
    ENTITLEMENT_ID NUMBER(38) references ENTITLEMENT not null,
    CONSTRAINT APP_USER_ENTITLEMENT_UK unique (USER_ID, ENTITLEMENT_ID)
)
/

-- APP_USER_PAGE
create table APP_USER_PAGE
(
    USER_ID NUMBER(38) references APP_USER not null,
    PAGE_ID NUMBER(38) references PAGE     not null,
    CONSTRAINT APP_USER_PAGE_UK unique (USER_ID, PAGE_ID)
)
/

-- AUDIT_TABLE
create sequence EVENT_LOG_ID_SEQ
/

create table EVENT_LOG
(
    ID         NUMBER(38)                                               not null primary key,
    OPERATION  VARCHAR2(10)                                             not null CHECK (OPERATION IN ('create', 'update', 'delete') ),
    TABLE_NAME VARCHAR2(15)                                             not null CHECK (TABLE_NAME IN ('app_user', 'subscriber', 'component_tag') ),
    BEFORE     CLOB CHECK ( BEFORE IS JSON),
    AFTER      CLOB CHECK ( AFTER IS JSON),
    USER_ID    NUMBER(38) references APP_USER                           not null,
    CREATED_AT TIMESTAMP(6) WITH TIME ZONE default CURRENT_TIMESTAMP(6) not null
)
/

create or replace trigger EVENT_LOG_ID_TRG
    before insert
    on EVENT_LOG
    for each row
begin
    if :new.id is null then
        select EVENT_LOG_ID_SEQ.nextval into :new.id from dual;
    end if;
end;
/



