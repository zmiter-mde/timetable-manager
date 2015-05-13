DROP DATABASE IF EXISTS DMIS;
CREATE DATABASE DMIS;
USE DMIS;

DROP TABLE IF EXISTS LOGS;
DROP TABLE IF EXISTS ACTIONS;
DROP TABLE IF EXISTS USERS_USER_ROLES_REF;
DROP TABLE IF EXISTS USER_ROLES;
DROP TABLE IF EXISTS USERS;

DROP TABLE IF EXISTS LESSONS;

DROP TABLE IF EXISTS LECTURES;
DROP TABLE IF EXISTS STUDENT_GROUPS;
DROP TABLE IF EXISTS ROOMS;
DROP TABLE IF EXISTS TUTORS;
DROP TABLE IF EXISTS SUBJECTS;


CREATE TABLE ACTIONS (
	ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	DESCRIPTION VARCHAR(128) NOT NULL,
    UNIQUE(DESCRIPTION)
);

CREATE TABLE LECTURES (
	ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	NUMBER INT NOT NULL,
	DAY_OF_WEEK INT NOT NULL,
    UNIQUE(NUMBER, DAY_OF_WEEK)
);

CREATE TABLE LOGS (
	ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	INFO VARCHAR(128) NOT NULL,
	USER_ID INT NOT NULL,
	ACTION_ID INT NOT NULL,
	TABLENAME VARCHAR(128) NOT NULL,
	DATE TIMESTAMP DEFAULT NOW()
);

CREATE TABLE ROOMS (
	ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	NUMBER INT NOT NULL,
	FLOOR INT NOT NULL,
    UNIQUE (NUMBER, FLOOR)
);


CREATE TABLE STUDENT_GROUPS (
	ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	TITLE VARCHAR(128) NOT NULL,
	FACULTY VARCHAR(128) NOT NULL,
	STUD_COUNT INT NOT NULL,
    UNIQUE (TITLE, FACULTY)
);

CREATE TABLE SUBJECTS (
	ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	TITLE VARCHAR(128) NOT NULL,
	NEED_PC BOOLEAN DEFAULT 0 NOT NULL,
	NEED_LAB BOOLEAN DEFAULT 0 NOT NULL,
    UNIQUE (TITLE)
);

CREATE TABLE TUTORS (
	ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	NAME VARCHAR(128) NOT NULL,
	SURNAME VARCHAR(128) NOT NULL,
	PATRONYMIC VARCHAR(128) NOT NULL,
	EXPIERENCE INT NOT NULL,
	WORKLOAD INT NOT NULL,
    UNIQUE (NAME, SURNAME, PATRONYMIC)
);

CREATE TABLE USER_ROLES (
	ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	TITLE VARCHAR(128) NOT NULL,
	DESCRIPTION VARCHAR(2048) NOT NULL,
    UNIQUE (TITLE)
);

CREATE TABLE USERS (
	ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	LOGIN VARCHAR(128) NOT NULL,
	PASS VARCHAR(128) NOT NULL,
    USERNAME VARCHAR(128) NOT NULL,
    SURNAME VARCHAR(128) NOT NULL,
    PATRONYMIC VARCHAR(128) NOT NULL,
    UNIQUE (LOGIN)
);

CREATE TABLE USERS_USER_ROLES_REF (
	ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	USER_ID INT NOT NULL,
	USER_ROLE_ID INT NOT NULL,
    UNIQUE (USER_ID, USER_ROLE_ID)
);

CREATE TABLE LESSONS (
	ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	GROUP_ID INT NOT NULL,
	ROOM_ID INT NOT NULL,
	TUTOR_ID INT NOT NULL,
	SUBJECT_ID INT NOT NULL,
	LECTURE_ID INT NOT NULL,
    UNIQUE (GROUP_ID, ROOM_ID, TUTOR_ID, SUBJECT_ID, LECTURE_ID)
);

ALTER TABLE LESSONS ADD FOREIGN KEY (GROUP_ID) REFERENCES STUDENT_GROUPS (ID);
ALTER TABLE LESSONS ADD FOREIGN KEY (LECTURE_ID) REFERENCES LECTURES (ID);
ALTER TABLE LESSONS ADD FOREIGN KEY (ROOM_ID) REFERENCES ROOMS (ID);
ALTER TABLE LESSONS ADD FOREIGN KEY (SUBJECT_ID) REFERENCES SUBJECTS (ID);
ALTER TABLE LESSONS ADD FOREIGN KEY (TUTOR_ID) REFERENCES TUTORS (ID);
ALTER TABLE LOGS ADD FOREIGN KEY (ACTION_ID) REFERENCES ACTIONS (ID);
ALTER TABLE LOGS ADD FOREIGN KEY (USER_ID) REFERENCES USERS (ID);
ALTER TABLE USERS_USER_ROLES_REF ADD FOREIGN KEY (USER_ID) REFERENCES USERS (ID);
ALTER TABLE USERS_USER_ROLES_REF ADD FOREIGN KEY (USER_ROLE_ID) REFERENCES USER_ROLES (ID);


DROP TRIGGER IF EXISTS USER_PASS_INSERT_TR;
CREATE TRIGGER USER_PASS_INSERT_TR BEFORE INSERT ON USERS
FOR EACH ROW SET
	NEW.PASS = MD5(NEW.PASS);

DROP TRIGGER IF EXISTS USER_PASS_UPDATE_TR;

DELIMITER //

CREATE TRIGGER USER_PASS_UPDATE_TR BEFORE UPDATE ON USERS
FOR EACH ROW
BEGIN
	DECLARE NEWPASS VARCHAR(128);
    SET NEWPASS = MD5(NEW.PASS);
	IF NEWPASS != MD5(OLD.PASS) THEN
		SET NEW.PASS = NEWPASS;
	END IF;
END; //

DELIMITER ;

INSERT INTO USERS (LOGIN, PASS, USERNAME, SURNAME, PATRONYMIC)
VALUES ('Admin', '12345678', 'Админ', 'Админин', 'Админович');

UPDATE USERS
SET PASS = 'zaqwsx123'
WHERE LOGIN = 'Admin';