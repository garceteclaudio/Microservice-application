insert into SUBJECT (ID, NAME) values (1, 'Matematica discreta');
insert into SUBJECT (ID, NAME) values (2, 'Fisica');
insert into WORK (ID, OCCUPATION_NAME, SALARY) values (1, 'Jugar', 0);
insert into WORK (ID, OCCUPATION_NAME, SALARY) values (2, 'Policia', 100);
insert into PERSON (ID, EMAIL, IS_STUDENT, LAST_NAME, NAME, WORK_ID) values (1, 'peppa@gmail.com', true, 'Pig', 'Peppa', 1);
insert into PERSON (ID, EMAIL, IS_STUDENT, LAST_NAME, NAME, WORK_ID) values (2, 'chase@gmail.com', false, 'Dog', 'Chase', 2);
--OPTIONAL:
insert into PERSON_SUBJECTS (PERSON_ID, SUBJECTS_ID) values (1, 1);
insert into PERSON_SUBJECTS (PERSON_ID, SUBJECTS_ID) values (1, 2);