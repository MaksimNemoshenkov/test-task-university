INSERT INTO group_of_students (id, name)
VALUES  (1,'MV-22'),
        (2,'MV-21'),
        (3,'MV-41'),
        (4,'MV-42'),
        (5,'MV-81');

INSERT INTO lesson (id, name)
VALUES (1, 'math'),
       (2, 'physics'),
       (3, 'programming'),
       (4, 'English'),
       (5, 'French'),
       (6, 'psychology'),
       (7, 'printing industry'),
       (8, 'Ukrainian'),
       (9, 'Strength of Materials'),
       (10, 'theoretical mechanics');

INSERT INTO hall (id, name)
VALUES (1, '207-30'),
       (2, '21-08'),
       (3, '65-08'),
       (4, '106-08'),
       (5, '406-35'),
       (6, '24-08'),
       (7, '202-17'),
       (8, '424-17'),
       (9, '414-17'),
       (10, '418-17'),
       (11, '202-17');

INSERT INTO student (id, group_id, name)
VALUES (1, 1, 'John Doe'),
       (2, 1, 'Katy Perry'),
       (3, 1, 'Joe Biden'),
       (4, 2, 'Taras Shevchenko'),
       (5, 2, 'Lesia Ukrainka'),
       (6, 2, 'Ivan Franko'),
       (7, 2, 'Lina Kostenko'),
       (8, 3, 'Albert Einstein'),
       (9, 3, 'Alexander Pushkin');

INSERT INTO schedule (id, group_id, hall_id, lesson_id)
VALUES (1, 1, 11, 1),
       (2, 1, 10, 2),
       (3, 1, 9, 3),
       (4, 1, 8, 4),
       (5, 1, 7, 5),
       (6, 1, 6, 6),
       (7, 1, 5, 7),
       (8, 1, 4, 8),
       (9, 1, 3, 9),
       (10, 2, 11, 10),
       (11, 2, 10, 1),
       (12, 2, 9, 2),
       (13, 2, 8, 3),
       (14, 3, 7, 4),
       (15, 3, 6, 5),
       (16, 3, 5, 6);

INSERT INTO day (day_id, days)
VALUES (1, 'MONDAY'),
       (10, 'MONDAY'),
       (9, 'MONDAY'),
       (8, 'MONDAY'),
       (7, 'MONDAY'),
       (6, 'TUESDAY'),
       (5, 'TUESDAY'),
       (7, 'TUESDAY'),
       (11, 'TUESDAY'),
       (2, 'WEDNESDAY'),
       (3, 'WEDNESDAY'),
       (4, 'WEDNESDAY'),
       (6, 'WEDNESDAY'),
       (2, 'THURSDAY'),
       (3, 'THURSDAY'),
       (4, 'THURSDAY'),
       (11, 'THURSDAY'),
       (5, 'FRIDAY'),
       (6, 'FRIDAY'),
       (7, 'FRIDAY'),
       (8, 'FRIDAY');



