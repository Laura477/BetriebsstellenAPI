-- script to read data from .csv file and create betriebsstelle table as main data source for the Rest Api.
-- The first row of the .csv file has been manipulated manually (against best practice) so that
-- column headers do not contain white spaces or special characters and can be processed by the CSVREAD command.
-- The .csv file has been downloaded from https://data.deutschebahn.com/dataset/data-betriebsstellen/resource/0d0acc75-38cc-4632-bf4f-20211007.html
DROP TABLE IF EXISTS BETRIEBSSTELLE;
CREATE TABLE BETRIEBSSTELLE AS SELECT PLC as location_code,
                               RL100Code as abbrev,
                               RL100Langname as name_lang,
                               RL100Kurzname as kurzname_kurz,
                               TypKurz as typ_kurz,
                               TypLang as typ_lang,
                               Betriebszustand as status,
                               DatumAb as valid_from,
                               DatumBis as valid_till,
                               Niederlassung,
                               Regionalbereich,
                               LetzteAenderung as last_change
    FROM CSVREAD('classpath:/DBNetz-Betriebsstellenverzeichnis-Stand2021-10.csv', null , 'fieldSeparator=;',  'charset=UTF-8' );
ALTER TABLE betriebsstelle ADD COLUMN id IDENTITY; --add identity column


