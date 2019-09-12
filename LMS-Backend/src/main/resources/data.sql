
/*
Init DB
*/

/*countries*/
INSERT INTO `wis`.`country`(`id`,`name`,`deleted`,`version`) VALUES (1,'Germany', b'0',0);
INSERT INTO `wis`.`country`(`id`,`name`,`deleted`,`version`) VALUES (2,'Bulgarija', b'0',0);
INSERT INTO `wis`.`country`(`id`,`name`,`deleted`,`version`) VALUES (3,'Russia', b'0',0);

/*places*/
INSERT INTO `wis`.`place`(`id`,`deleted`,`name`,`version`,`country_id`) VALUES (1,b'0','Hamburg',1,1);
INSERT INTO `wis`.`place`(`id`,`deleted`,`name`,`version`,`country_id`) VALUES (2,b'0','Sofija',1,2);
INSERT INTO `wis`.`place`(`id`,`deleted`,`name`,`version`,`country_id`) VALUES (3,b'0','Moscow',1,3);

/*addresses*/
INSERT INTO `wis`.`address`(`id`,`deleted`,`number`,`street`,`version`,`place_id`) VALUES (1,b'0','45','Strass Dr.',0,1);
INSERT INTO `wis`.`address`(`id`,`deleted`,`number`,`street`,`version`,`place_id`) VALUES (2,b'0','23','Szehan Dr.',0,2);
INSERT INTO `wis`.`address`(`id`,`deleted`,`number`,`street`,`version`,`place_id`) VALUES (3,b'0','12','Blyat Dr.',0,3);

