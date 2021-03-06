for starting this project you can use this comand:

docker-compose up -d

# test-task-university
Задача: реализовать spring boot REST сервис, который моделирует структуру университета и
предоставляет расписание занятий для конкретного студента в конкретный день. Расписание – это
список лекций, которые есть у студента в конкретный день, время и порядок не учитывать.
Результатом работы должен стать Maven (или Gradle) проект, который может собираться в одну
или несколько JAR-библиотек.

Требования к реализации:
1. Предоставить UML диаграмму университета, а также диаграмму моделей в приложении.
(использовать draw.io)
2. В качестве архитектуры использовать классическую REST архитектуру.
3. API должен предоставлять CRUD функционал для всех объектов в приложении (студенты,
группы, аудитории и т.д.) и endpoint для получения расписания
4. Сервисы в обязательном порядке должны быть покрыты unit тестами.
5. Использовать в качестве базы данных PostgreSQL.
6. Тестовые данные генерируются программно, либо SQL скриптом.
7. Приложение должно быть оформлено в докер контейнеры, и запускаться одной командой
docker-compose up -d.
8. Качество кода не менее важно, чем функциональность.
9. Результаты тестового задания нужно предоставить в виде ссылки на публичный GiHub
репозиторий
