DROP TABLE IF EXISTS pokeusers CASCADE;

CREATE TABLE pokeusers (
trainer_id SERIAL PRIMARY KEY,
user_name VARCHAR (50) UNIQUE,
pass_word INTEGER,
account_type VARCHAR (30),
poke_dollars NUMERIC (9,2)CHECK(poke_dollars>0),
trainer_persona VARCHAR (50) REFERENCES pokepersona(trainer_persona)
);

SELECT * FROM pokeusers;

INSERT INTO pokeusers (user_name, pass_word, account_type, poke_dollars, trainer_persona)
VALUES ('Skittlehead13', -728070160, 'Poke Trainer', 523.60, 'May'),
('SilverLine', -1422267635, 'Elite Four', 1509.23, 'Drake'),
('MagicalJourney', -2070693650, 'Gym Leader', 2301.54, 'Misty'),
('Nekros', 1053901340, 'Champion', 10000.00, 'Cynthia'),
('YellowHawk', 205096276, 'Poke Trainer', 23.42, 'Lillie'),
('RechSentinel', -1237699881, 'Elite Four', 723.00, 'Lorelei'),
('Kikan', 713379175, 'Elite Four', 324.00, 'Marshal'),
('CommanderHawk', 1075820759, 'Elite Four', 832.00, 'Wikstrom'),
('SadKeeshe', -1553160139, 'Gym Leader', 102.81, 'Wattson'),
('OceanGhost', -336645413, 'Poke Trainer', 62.45, 'Red');


DROP TABLE IF EXISTS pokepersona CASCADE;

CREATE TABLE pokepersona (
trainer_id SERIAL PRIMARY KEY,
trainer_persona VARCHAR(50) UNIQUE REFERENCES pokemons(trainer_persona),
region VARCHAR(30),
element_type VARCHAR(20)
);

INSERT INTO pokepersona (trainer_persona, region, element_type) VALUES
('May', 'Hoenn', 'Multi-type'),
('Drake', 'Hoenn', 'Dragon-type'),
('Misty', 'Kanto', 'Water-type'),
('Cynthia', 'Sinnoh', 'Multi-type'),
('Lillie', 'Alola', 'Multi-type'),
('Lorelei', 'Indigo Plateau', 'Ice-type'),
('Marshal', 'Unova', 'Fighting-type'),
('Wikstrom', 'Kalos', 'Steel-type'),
('Wattson', 'Hoenn', 'Electric-type'),
('Red', 'Kanto', 'Multi-type');

CREATE TABLE pokemons (
trainer_persona VARCHAR (50) PRIMARY KEY,
poke_1 VARCHAR (30),
poke_2 VARCHAR (30),
poke_3 VARCHAR (30),
poke_4 VARCHAR (30),
poke_5 VARCHAR (30),
poke_6 VARCHAR (30)
);

DROP TABLE IF EXISTS pokemons CASCADE;

INSERT INTO pokemons (trainer_persona, poke_1, poke_2, poke_3, poke_4, poke_5, poke_6) VALUES
('May', 'Blaziken','Beautifly', 'Skitty', 'Munchlax', 'Wartortle', 'Venusaur'),
('Drake', 'Altaria', 'Flygon', 'Flygon', 'Kingdra', 'Salamence', null),
('Misty', 'Gyrados', 'Starmie', 'Psyduck', 'Politoed', 'Corsola', null),
('Cynthia', 'Garchomp', 'Lucario', 'Spiritomb', 'Roserade', 'Gastrodon', 'Milotic'),
('Lillie', 'Cutiefly', 'Lunala', 'Mantine', NULL, NULL, null),
('Lorelei', 'Dewgong', 'Jinx', 'Cloyster', 'Lapras', 'Slowbro', null),
('Marshal', 'Sawk', 'Throh', 'Lucario', 'Machamp', 'Mienshao', 'Conkeldurr'),
('Wikstrom', 'Klefki', 'Probopass', 'Scizor', 'Aegislash', NULL, null),
('Wattson', 'Manectric', 'Magneton', 'Electrobe', 'Magnezone', NULL, null),
('Red', 'Charizard', 'Pikachu', 'Blastoise', 'Lapras', 'Snorlax', 'Arcanine');

SELECT poke_6 FROM trainerpoke WHERE trainer_persona = 'May';


--INSERT INTO avengers (hero_name, hero_power, first_name, last_name, power_level, active, home_name)
   -- VALUES ('iron man', 'money', 'tony', 'stark', 150.24, FALSE, null),
   -- ('hulk', 'angry', 'bruce', 'banner', 853.24, FALSE, null),
    --('spiderman', 'sticky hands', 'peter', 'parker', 632.24, TRUE, null);

SELECT * FROM pokeusers WHERE user_name = 'Nekros';

SELECT user_name, pass_word FROM pokeusers; 

SELECT poke_dollars FROM pokeusers WHERE user_name = 'Nekros';

SELECT trainer_persona FROM trainerpoke WHERE trainer_id =2;

SELECT poke_1, poke_2, poke_3, poke_4, poke_5, poke_6 FROM trainerpoke WHERE trainer_id =4;

SELECT * FROM pokeusers LEFT JOIN trainerpersona ON trainerpersona.trainer_id = pokeusers.trainer_id;

SELECT account_type FROM pokeusers WHERE user_name = 'Nekros';

SELECT * FROM pokeusers WHERE user_name = Nekros;

SELECT poke_dollars FROM pokeusers WHERE user_name = 'Nekros'; 

UPDATE pokeusers SET poke_dollars = 600.89 WHERE user_name = 'Nekros';

SELECT poke_dollars FROM pokeusers WHERE user_name = 'Nekros';

SELECT poke_dollars FROM pokeusers WHERE user_name = 'Nekros';