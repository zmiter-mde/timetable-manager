delete from diplom.rooms where id > 0;

insert into diplom.rooms (ID, NUMBER, FLOOR) values (1, 1, 1);
insert into diplom.rooms (ID, NUMBER, FLOOR) values (2, 2, 1);
insert into diplom.rooms (ID, NUMBER, FLOOR) values (3, 3, 1);
insert into diplom.rooms (ID, NUMBER, FLOOR) values (4, 4, 1);
insert into diplom.rooms (ID, NUMBER, FLOOR) values (5, 5, 1);

insert into diplom.rooms (ID, NUMBER, FLOOR) values (6, 1, 2);
insert into diplom.rooms (ID, NUMBER, FLOOR) values (7, 2, 2);
insert into diplom.rooms (ID, NUMBER, FLOOR) values (8, 3, 2);
insert into diplom.rooms (ID, NUMBER, FLOOR) values (9, 4, 2);
insert into diplom.rooms (ID, NUMBER, FLOOR) values (10, 5, 2);

insert into diplom.rooms (ID, NUMBER, FLOOR) values (11, 1, 3);
insert into diplom.rooms (ID, NUMBER, FLOOR) values (12, 2, 3);
insert into diplom.rooms (ID, NUMBER, FLOOR) values (13, 3, 3);
insert into diplom.rooms (ID, NUMBER, FLOOR) values (14, 4, 3);
insert into diplom.rooms (ID, NUMBER, FLOOR) values (15, 5, 3);


delete from diplom.lectures where id > 0;

insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (1, 1, 1);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (2, 2, 1);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (3, 3, 1);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (4, 4, 1);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (5, 5, 1);

insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (6, 1, 2);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (7, 2, 2);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (8, 3, 2);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (9, 4, 2);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (10, 5, 2);

insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (11, 1, 3);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (12, 2, 3);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (13, 3, 3);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (14, 4, 3);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (15, 5, 3);

insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (16, 1, 4);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (17, 2, 4);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (18, 3, 4);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (19, 4, 4);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (20, 5, 4);

insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (21, 1, 5);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (22, 2, 5);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (23, 3, 5);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (24, 4, 5);
insert into diplom.lectures (ID, NUMBER, DAY_OF_WEEK) values (25, 5, 5);


delete from diplom.student_groups where id > 0;

insert into diplom.student_groups (ID, TITLE, FACULTY, STUD_COUNT) values (1, 'Умники', 'Математический', 17);
insert into diplom.student_groups (ID, TITLE, FACULTY, STUD_COUNT) values (2, 'Умницы', 'Математический', 15);
insert into diplom.student_groups (ID, TITLE, FACULTY, STUD_COUNT) values (3, 'Умники', 'Физический', 16);
insert into diplom.student_groups (ID, TITLE, FACULTY, STUD_COUNT) values (4, 'Умницы', 'Физический', 14);


delete from diplom.subjects where id > 0;

insert into diplom.subjects (ID, TITLE, NEED_PC, NEED_LAB) values (1, 'Практика умничества', 1, 1);
insert into diplom.subjects (ID, TITLE, NEED_PC, NEED_LAB) values (2, 'Умничество на производстве', 1, 0);
insert into diplom.subjects (ID, TITLE, NEED_PC, NEED_LAB) values (3, 'Основы умничества', 0, 1);
insert into diplom.subjects (ID, TITLE, NEED_PC, NEED_LAB) values (4, 'Теория умничества', 0, 0);


delete from diplom.tutors where id > 0;

insert into diplom.tutors (ID, NAME, SURNAME, PATRONYMIC, EXPIERENCE, WORKLOAD)
values (1, 'Умник', 'Умниковин', 'Умникович', 10, 10);
insert into diplom.tutors (ID, NAME, SURNAME, PATRONYMIC, EXPIERENCE, WORKLOAD)
values (2, 'Умница', 'Умницина', 'Умниковна', 11, 9);


delete from diplom.lessons where id > 0;

insert into diplom.lessons (ID, GROUP_ID, ROOM_ID, TUTOR_ID, SUBJECT_ID, LECTURE_ID) values (1, 1, 1, 1, 1, 1);
insert into diplom.lessons (ID, GROUP_ID, ROOM_ID, TUTOR_ID, SUBJECT_ID, LECTURE_ID) values (2, 2, 2, 2, 2, 2);
insert into diplom.lessons (ID, GROUP_ID, ROOM_ID, TUTOR_ID, SUBJECT_ID, LECTURE_ID) values (3, 3, 3, 1, 3, 3);
insert into diplom.lessons (ID, GROUP_ID, ROOM_ID, TUTOR_ID, SUBJECT_ID, LECTURE_ID) values (4, 4, 4, 2, 4, 1);
insert into diplom.lessons (ID, GROUP_ID, ROOM_ID, TUTOR_ID, SUBJECT_ID, LECTURE_ID) values (5, 1, 1, 1, 1, 2);
insert into diplom.lessons (ID, GROUP_ID, ROOM_ID, TUTOR_ID, SUBJECT_ID, LECTURE_ID) values (6, 2, 2, 2, 2, 3);
insert into diplom.lessons (ID, GROUP_ID, ROOM_ID, TUTOR_ID, SUBJECT_ID, LECTURE_ID) values (7, 3, 3, 1, 3, 1);
insert into diplom.lessons (ID, GROUP_ID, ROOM_ID, TUTOR_ID, SUBJECT_ID, LECTURE_ID) values (8, 4, 4, 2, 4, 2);
insert into diplom.lessons (ID, GROUP_ID, ROOM_ID, TUTOR_ID, SUBJECT_ID, LECTURE_ID) values (9, 1, 1, 1, 1, 3);
insert into diplom.lessons (ID, GROUP_ID, ROOM_ID, TUTOR_ID, SUBJECT_ID, LECTURE_ID) values (10, 2, 2, 2, 2, 1);
insert into diplom.lessons (ID, GROUP_ID, ROOM_ID, TUTOR_ID, SUBJECT_ID, LECTURE_ID) values (11, 3, 3, 1, 3, 2);
insert into diplom.lessons (ID, GROUP_ID, ROOM_ID, TUTOR_ID, SUBJECT_ID, LECTURE_ID) values (12, 4, 4, 2, 4, 3);
