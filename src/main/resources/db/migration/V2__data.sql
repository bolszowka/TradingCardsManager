insert into producers (id, name, creation_date, version, uuid) values (1, 'Panini', current_timestamp, 0, '87cfa61e-7316-4f1b-a9f0-907b6b3578a6');
insert into producers (id, name, creation_date, version, uuid) values (2, 'Topps', current_timestamp, 0, '857bf96b-875b-48ee-8ce6-103ca0492fc5');

insert into collections(id, name, creation_date, version, uuid, producer_id) values (1, 'Fifa 365 2019', current_timestamp, 0, 'f130df0b-01f9-4f95-9328-500b448c084d', 1);
insert into collections(id, name, creation_date, version, uuid, producer_id) values (2, 'Fifa World Cup 2018', current_timestamp, 0, '1915ff74-5845-40bd-8aa2-310cede81995', 1);
insert into collections(id, name, creation_date, version, uuid, producer_id) values (3, 'Champions League 19/20', current_timestamp, 0, 'e12319d9-38ec-44a3-9eff-00aa7900114f', 2);

insert into cards (id, number, name, club_country, type, creation_date, version, uuid, collection_id) values
    (1, 1, 'Robert Lewandowski', 'FC Bayern Munich', 'Base card', current_timestamp, 0, '9c4b5b5f-abd5-4096-a23c-daf7bc9a9f56', 1);
insert into cards (id, number, name, club_country, type, creation_date, version, uuid, collection_id) values
    (2, 23, 'Cristino Ronaldo', 'Juventus Turyn', 'Base card', current_timestamp, 0, 'd2cf539b-cfeb-47e1-9b59-737dced78121', 1);
insert into cards (id, number, name, club_country, type, creation_date, version, uuid, collection_id) values
    (3, 122, 'Sergio Ramos', 'Real Madrid', 'Defensive wall', current_timestamp, 0, '38ecfe7e-5060-4b6f-afe3-688976bfcc73', 1);
insert into cards (id, number, name, club_country, type, creation_date, version, uuid, collection_id) values
    (4, 222, 'Wojciech Szczesny', 'Juventus Turyn', 'Goal keeper', current_timestamp, 0, '2bcd9eee-9f6c-44b0-a1a1-3f3bf70f7e40', 1);
insert into cards (id, number, name, club_country, type, creation_date, version, uuid, collection_id) values
    (5, 365, 'Kingsley Coman/Robert Lewandowski/Serge Ganbry', 'FC Bayern Munich', 'Attacking trio', current_timestamp, 0, '92d25bf5-cc71-493b-b63e-fbff2af940ff', 1);
insert into cards (id, number, name, club_country, type, creation_date, version, uuid, collection_id) values
    (6, 111, 'Wojciech Szczesny', 'Poland', 'Base Card', current_timestamp, 0, 'ccd4dc92-e6e1-461c-b2e2-1816573cb1c4', 2);
insert into cards (id, number, name, club_country, type, creation_date, version, uuid, collection_id) values
    (7, 222, 'Harry Kane', 'England', 'Fans Favourite', current_timestamp, 0, '490caeb4-f4ca-4b70-9a40-b373a09e7121', 2);
insert into cards (id, number, name, club_country, type, creation_date, version, uuid, collection_id) values
    (8, 343, 'Karim Beznema', 'Real Madrid', 'Club 100', current_timestamp, 0, 'a921e0d0-fc78-4b08-8bfd-ab18aede08a0', 3);