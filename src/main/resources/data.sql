DROP TABLE IF EXISTS BETRIEBSSTELLE;
CREATE TABLE BETRIEBSSTELLE AS SELECT PLC as location_code,
                               RL100Code as abbrev,
                               RL100Langname as name,
                               RL100Kurzname as kurzname,
                               TypKurz as typk,
                               TypLang as typl,
                               Betriebszustand as status,
                               DatumAb as valid_from,
                               DatumBis as valid_till,
                               Niederlassung,
                               Regionalbereich,
                               LetzteAenderung as last_change
    FROM CSVREAD('classpath:/DBNetz-Betriebsstellenverzeichnis-Stand2021-10.csv', null , 'fieldSeparator=;',  'charset=UTF-8' );
ALTER TABLE betriebsstelle ADD COLUMN id IDENTITY;


