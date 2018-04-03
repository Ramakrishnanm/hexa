CREATE DATABASE hexa;

GRANT ALL PRIVILEGES ON hexa.* TO 'user1'@'localhost' IDENTIFIED BY 'userpazz';

create table USER
(
	USER_ID INT UNSIGNED NOT NULL AUTO_INCREMENT,
   	NAME VARCHAR(100) NOT NULL,
   	LOGIN_ID VARCHAR(100) NOT NULL,
   	PASSWORD VARCHAR(100) NOT NULL,
   	PRIMARY KEY (USER_ID)
);


create table SOFT_SKILL
(
	SKILL_ID INT UNSIGNED NOT NULL AUTO_INCREMENT,
   	NAME VARCHAR(100) NOT NULL,  
   	PRIMARY KEY (SKILL_ID)
);


create table USER_SKILL_RATING
(
	USID INT UNSIGNED NOT NULL AUTO_INCREMENT,
	USER_ID INT UNSIGNED NOT NULL,
	SKILL_ID INT UNSIGNED NOT NULL,
	RATING INT UNSIGNED NOT NULL,
	PRIMARY KEY (USID)
);


ALTER TABLE USER_SKILL_RATING ADD CONSTRAINT FK_USR_USER_ID FOREIGN KEY
(
   USER_ID
)
REFERENCES USER (USER_ID) ON DELETE CASCADE;

ALTER TABLE USER_SKILL_RATING ADD CONSTRAINT FK_USR_SKILL_ID FOREIGN KEY
(
   SKILL_ID
)
REFERENCES SOFT_SKILL (SKILL_ID);


-- insert Queries


insert into user(USER_ID, NAME,	LOGIN_ID, PASSWORD) values (1,"dinesh","dinesh@hexa.com","dinesh");
insert into user(USER_ID, NAME,	LOGIN_ID, PASSWORD) values (2, "kumar", "kumar@hexa.com", "kumar");
insert into user(USER_ID, NAME,	LOGIN_ID, PASSWORD) values (3, "ram", "ram@hexa.com", "ram");
insert into user(USER_ID, NAME,	LOGIN_ID, PASSWORD) values (4, "sathiya", "sathiya@hexa.com", "sathiya");
insert into user(USER_ID, NAME,	LOGIN_ID, PASSWORD) values (5, "anand", "anand@hexa.com", "anand");


insert into soft_skill (SKILL_ID, NAME) values (1,	"JAVA");
insert into soft_skill (SKILL_ID, NAME) values (2,	".NET");
insert into soft_skill (SKILL_ID, NAME) values (3,	"PYTHON");
insert into soft_skill (SKILL_ID, NAME) values (4,	"HTML");
insert into soft_skill (SKILL_ID, NAME) values (5,	"CSS");
insert into soft_skill (SKILL_ID, NAME) values (6,	"JAVA SCRIPT");


insert into USER_SKILL_RATING(USID, USER_ID, SKILL_ID, RATING) values (1, 1, 1, 5);
insert into USER_SKILL_RATING(USID, USER_ID, SKILL_ID, RATING) values (2, 2, 2, 6);
insert into USER_SKILL_RATING(USID, USER_ID, SKILL_ID, RATING) values (3, 3, 3, 7);
insert into USER_SKILL_RATING(USID, USER_ID, SKILL_ID, RATING) values (4, 4, 4, 8);
insert into USER_SKILL_RATING(USID, USER_ID, SKILL_ID, RATING) values (5, 5, 5, 9);
insert into USER_SKILL_RATING(USID, USER_ID, SKILL_ID, RATING) values (6, 5, 4, 9);
insert into USER_SKILL_RATING(USID, USER_ID, SKILL_ID, RATING) values (7, 4, 3, 9);


