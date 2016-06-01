Написать REST сервис hello с ресурсом
/hello/contacts?nameFilter=val
Запрос к contacts должен возвращать контакты из таблицы БД contacts. Параметр nameFilter обязателен. В него передаётся регулярное выражение. В возвращаемых данных не должно быть записей, в которых contacts.name совпадает с регулярным выражением.
Массив контактов возвращается в json формате
Пример запросов
/hello/contacts?nameFilter=^A.*$ - возвращает контакты, которые НЕ начинаются с A
/hello/contacts?nameFilter=^.*[aei].*$ - возвращает контакты, которые НЕ содержат букв a, e, i
[![Build Status](https://travis-ci.org/KirienkoEvgeniy/ContactsService.svg?branch=master)](https://travis-ci.org/KirienkoEvgeniy/ContactsService)
