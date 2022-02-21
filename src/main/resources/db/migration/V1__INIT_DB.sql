create sequence hibernate_sequence start 1 increment 1;

create table day (
    day_id int8 not null,
    days varchar(255) not null
);

create table group_of_students (
    id int8 not null,
    name varchar(255) not null,
    primary key (id)
);

create table hall (
    id int8 not null,
    name varchar(255),
    primary key (id)
);

create table lesson (
    id int8 not null,
    name varchar(255) not null,
    primary key (id)
);

create table schedule (
    id int8 not null,
    group_id int8,
    hall_id int8,
    lesson_id int8,
    primary key (id)
);

create table student (
    id int8 not null,
    name varchar(255) not null,
    group_id int8,
    primary key (id)
);

alter table if exists day
    add constraint day_schedule_fk
    foreign key (day_id) references schedule;

alter table if exists schedule
    add constraint schedule_group_fk
    foreign key (group_id) references group_of_students;

alter table if exists schedule
    add constraint schedule_hall_fk
    foreign key (hall_id) references hall;

alter table if exists schedule
    add constraint schedule_lesson_fk
    foreign key (lesson_id) references lesson;

alter table if exists student
    add constraint student_group_fk
    foreign key (group_id) references group_of_students;