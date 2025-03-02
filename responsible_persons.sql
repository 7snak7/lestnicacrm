create table responsible_persons
(
    id   serial
        constraint responsible_persons_pk
            primary key,
    name varchar(255) not null
);

alter table responsible_persons
    owner to postgres;

INSERT INTO public.responsible_persons (id, name) VALUES (5, 'Фёдоров Юрий');
INSERT INTO public.responsible_persons (id, name) VALUES (8, 'Отдел корпоративной культуры');
INSERT INTO public.responsible_persons (id, name) VALUES (4, 'Миллер Максим');
INSERT INTO public.responsible_persons (id, name) VALUES (3, 'Селезнев Лев');
INSERT INTO public.responsible_persons (id, name) VALUES (2, 'Близнюк Евгений');
INSERT INTO public.responsible_persons (id, name) VALUES (7, 'Отдел маркетинга');
INSERT INTO public.responsible_persons (id, name) VALUES (1, 'Гаджиев Анар');
INSERT INTO public.responsible_persons (id, name) VALUES (6, 'Успенская Ольга');
