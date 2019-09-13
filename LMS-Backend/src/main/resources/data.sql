
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

/*courses*/
/*Faculty of Software Engineering*/
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `numberOfLectures`,`numberOfExercises`, `version`) VALUES (1,b'0','Internet Software Architecture',8,b'1','High level structures of a software system and the discipline of creating such structures and systems. Each structure comprises software elements, relations among them, and properties of both elements and relations. The architecture of a software system is a metaphor, analogous to the architecture of a building. It functions as a blueprint for the system and the developing project, laying out the tasks necessary to be executed by the design teams.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `numberOfLectures`,`numberOfExercises`, `version`) VALUES (1,b'0','Object Oriented Programming 2',8,b'1','Interpreted languages are read by a program called an interpreter and are executed by that program. While they are as portable as their interpreter and have no long compile times, interpreted languages are usually much slower than an equivalent compiled program.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `numberOfLectures`,`numberOfExercises`, `version`) VALUES (1,b'0','Computer Networks',8,b'1','A computer network is a digital telecommunications network which allows nodes to share resources. In computer networks, computing devices exchange data with each other using connections (data links) between nodes. These data links are established over cable media such as wires or optic cables, or wireless media such as Wi-Fi.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `numberOfLectures`,`numberOfExercises`, `version`) VALUES (1,b'0','Statistics',8,b'1','Statistics is a branch of mathematics dealing with data collection, organization, analysis, interpretation and presentation. In applying statistics to, for example, a scientific, industrial, or social problem, it is conventional to begin with a statistical population or a statistical model process to be studied. Populations can be diverse topics such as all people living in a country or every atom composing a crystal.',12,13,0);

/*Faculty of Business and Economics*/
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `numberOfLectures`,`numberOfExercises`, `version`) VALUES (1,b'0','Pure Maths',8,b'1','Pure mathematics is the study of mathematical concepts independently of any application outside mathematics. These concepts may originate in real-world concerns, and the results obtained may later turn out to be useful for practical applications, but the pure mathematicians are not primarily motivated by such applications.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `numberOfLectures`,`numberOfExercises`, `version`) VALUES (1,b'0','Economics',8,b'1','',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `numberOfLectures`,`numberOfExercises`, `version`) VALUES (1,b'0','Business Studies',8,b'1','',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `numberOfLectures`,`numberOfExercises`, `version`) VALUES (1,b'0','Accounting',8,b'1','',12,13,0);

/*Faculty of 
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `numberOfLectures`,`numberOfExercises`, `version`) VALUES (1,b'0','Hotel Management',8,b'1','',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `numberOfLectures`,`numberOfExercises`, `version`) VALUES (1,b'0','Hotel Management',8,b'1','',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `numberOfLectures`,`numberOfExercises`, `version`) VALUES (1,b'0','Hotel Management',8,b'1','',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `numberOfLectures`,`numberOfExercises`, `version`) VALUES (1,b'0','Hotel Management',8,b'1','',12,13,0);