INSERT INTO Project (name,description) VALUES ( 'XGBU Project', 'XGBU Project description' );
INSERT INTO Project (name,description) VALUES ( 'CAGBU', 'Cagbu Project description' );
INSERT INTO Project (name,description) VALUES ( 'My Project', 'MY Project description' );

INSERT INTO PAGE (NAME, DESCRIPTION, PROJECT_ID)
VALUES ('XGBU Page 1', 'XGBU Page 1 Descripition', 1);
INSERT INTO PAGE (NAME, DESCRIPTION, PROJECT_ID)
VALUES ('XGBU Page 2', 'XGBU Page 2 Descripition', 1);
INSERT INTO PAGE (NAME, DESCRIPTION, PROJECT_ID)
VALUES ('XGBU Page 3', 'XGBU Page 3 Descripition', 1);

INSERT INTO PAGE (NAME, DESCRIPTION, PROJECT_ID) VALUES ('Cagbu Page 2','Cagbu Page 2 Descripition',2);
INSERT INTO PAGE (NAME, DESCRIPTION, PROJECT_ID)
VALUES ('Cagbu Page 3', 'Cagbu Page 3 Descripition', 2);

INSERT INTO PAGE (NAME, DESCRIPTION, PROJECT_ID) VALUES ('MY Page 2','MY Page 2 Descripition',3);
INSERT INTO PAGE (NAME, DESCRIPTION, PROJECT_ID)
VALUES ('MY Page 3', 'MY Page 3 Descripition', 3);

INSERT INTO COMPONENT (NAME, STATUS, PAGE_ID) VALUES ('test Component',0,1);
INSERT INTO COMPONENT (NAME, STATUS, PAGE_ID) VALUES ('test Component2',0,1);
INSERT INTO COMPONENT (NAME, STATUS, PAGE_ID) VALUES ('test Component13',0,2);
INSERT INTO COMPONENT (NAME, STATUS, PAGE_ID) VALUES ('test Component23',0,3);
