
/*
Init DB
*/

SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT;
SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS;
SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION;
SET NAMES utf8;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';
SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0; 

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


/*Universities*/ /*university rector needs to be filled in*/
INSERT INTO `wis`.`university`(`id`,`deleted`,`name`,`version`,`year_of_establishment`,`address_id`) VALUES (1,b'0','Everst Univeristy of Hamburg',0,'2005-02-03',1);
INSERT INTO `wis`.`university`(`id`,`deleted`,`name`,`version`,`year_of_establishment`,`address_id`) VALUES (2,b'0','Everst Univeristy of Sofia',0,'2006-08-03',2);
INSERT INTO `wis`.`university`(`id`,`deleted`,`name`,`version`,`year_of_establishment`,`address_id`) VALUES (3,b'0','Everst Univeristy of Moscow',0,'2008-06-03',3);

/*Courses*/
/*Faculty of Software Engineering and Systems*/
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (1,b'0','Internet Software Architecture',8,b'1','High level structures of a software system and the discipline of creating such structures and systems. Each structure comprises software elements, relations among them, and properties of both elements and relations. The architecture of a software system is a metaphor, analogous to the architecture of a building. It functions as a blueprint for the system and the developing project, laying out the tasks necessary to be executed by the design teams.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (2,b'0','Object Oriented Programming 2',8,b'1','Interpreted languages are read by a program called an interpreter and are executed by that program. While they are as portable as their interpreter and have no long compile times, interpreted languages are usually much slower than an equivalent compiled program.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (3,b'0','Computer Networks',6,b'1','A computer network is a digital telecommunications network which allows nodes to share resources. In computer networks, computing devices exchange data with each other using connections (data links) between nodes. These data links are established over cable media such as wires or optic cables, or wireless media such as Wi-Fi.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (4,b'0','Statistics',6,b'1','Statistics is a branch of mathematics dealing with data collection, organization, analysis, interpretation and presentation. In applying statistics to, for example, a scientific, industrial, or social problem, it is conventional to begin with a statistical population or a statistical model process to be studied. Populations can be diverse topics such as all people living in a country or every atom composing a crystal.',12,13,0);

/*Faculty of Economics*/
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (5,b'0','Pure Maths',6,b'1','Pure mathematics is the study of mathematical concepts independently of any application outside mathematics. These concepts may originate in real-world concerns, and the results obtained may later turn out to be useful for practical applications, but the pure mathematicians are not primarily motivated by such applications.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (6,b'0','Economics',6,b'1','Within the Department of Biochemistry over 50 research groups led by investigators of international standing collaborate with colleagues around the world to answer fundamental questions on how cells and their constituent molecules work in life and relate to disease.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (7,b'0','Business Studies',8,b'1','Business Studies is an academic subject taught in schools and at university level in many countries. Its study combines elements of accountancy, finance, marketing, organizational studies and economics.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (8,b'0','Accounting',8,b'1','An art of recording , classifying , summarising & communicating financial information to users for correct decision making.',12,13,0);

/*Faculty of Biology*/
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (9,b'0','Biochemistry',8,b'1','Biochemistry, sometimes called biological chemistry, is the study of chemical processes within and relating to living organisms.Biochemical processes give rise to the complexity of life.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (10,b'0','Genetics',8,b'1','Genetics is a branch of biology concerned with the study of genes, genetic variation, and heredity in organisms.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (11,b'0','Pharmacology',8,b'1','The use of medicines is one of the principal ways of combating disease. Examples of important medicines are antibacterials, anti-cancer drugs, anti-migraine agents, and drugs used in the treatment of cardiovascular disease and asthma, just to name a few.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (12,b'0','Botanical Studies',6,b'1','Botanical Studies is an open access journal that encompasses all aspects of botany, including but not limited to taxonomy, morphology, development, genetics, evolution, reproduction, systematics, and biodiversity of all plant groups, algae, and fungi. ',12,13,0);

/*Faculty of Languages*/
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (13,b'0','French',8,b'1','French is one of the world’s major languages. It is a main or official language not just in France, but in parts of Belgium and Switzerland, in Monaco, in parts of Canada',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (14,b'0','Spanish',8,b'1','The Spanish language is the most widely spoken Romance language, both in terms of number of speakers and the number of countries in which it is the dominant language.There are more than 400 million Spanish speakers worldwide.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (15,b'0','English',8,b'1','English language, West Germanic language of the Indo-European language family that is closely related to Frisian, German, and Dutch (in Belgium called Flemish) languages. English originated in England and is the dominant language of the United States, the United Kingdom, Canada, Australia, Ireland, New Zealand, and various island nations in the Caribbean Sea and the Pacific Ocean.',12,13,0);
INSERT INTO `wis`.`course`(`id`,`deleted`,`title`,`ects`,`obligatory`,`description`, `number_of_lectures`,`number_of_exercises`, `version`) VALUES (16,b'0','German',8,b'1','One of the major languages of the world, German is a native language to almost 100 million people worldwide and the most widely spoken native language in the European Union. German is the third most commonly spoken foreign language in the EU after English and French, making it the second biggest language in the EU in terms of overall speakers.',12,13,0);


/*Faculties*/
/*Hamburg Faculties*/
INSERT INTO `wis`.`faculty`(`id`,`deleted`,`name`,`version`,`university_id`) VALUES (1,b'0','Technical Science',1,1);
INSERT INTO `wis`.`faculty`(`id`,`deleted`,`name`,`version`,`university_id`) VALUES (2,b'0','Languages',1,1);

/*Sofia Faculties*/
INSERT INTO `wis`.`faculty`(`id`,`deleted`,`name`,`version`,`university_id`) VALUES (3,b'0','Economic',1,2);
INSERT INTO `wis`.`faculty`(`id`,`deleted`,`name`,`version`,`university_id`) VALUES (4,b'0','Technical Science',1,2);

/*Moscow Faculties*/
INSERT INTO `wis`.`faculty`(`id`,`deleted`,`name`,`version`,`university_id`) VALUES (5,b'0','Biology',1,3);
INSERT INTO `wis`.`faculty`(`id`,`deleted`,`name`,`version`,`university_id`) VALUES (6,b'0','Economic',1,3);
INSERT INTO `wis`.`faculty`(`id`,`deleted`,`name`,`version`,`university_id`) VALUES (7,b'0','Languages',1,3);

/*Outcomes*/
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (1,b'0','A higher level understanding of structural based software systems',0,1);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (2,b'0','The ability to design a working back-end system',0,1);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (3,b'0','A highger level understanding of object oriented programming',0,2);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (4,b'0','They will be able to understand and take on computer networking tasks',0,3);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (5,b'0','Understand the key principles of statistics. Interpret and evaluate the kinds of data found in everyday life',0,4);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (6,b'0','Interpret and evaluate the kinds of data found in everyday life',0,4);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (7,b'0','An understanding of mathematical principles and an appreciation of mathematics as a logical and coherent subject',0,5);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (8,b'0','Students will understand and demonstrate core micro-economic terms, concepts, and theories',0,6);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (9,b'0','Students will be able to demonstrate an ability to identify alternative solutions to problems',0,6);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (10,b'0','Business Studies fosters intellectual, social and moral development by assisting students to think critically about the role of business',0,7);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (11,b'0','Define bookkeeping and accounting',0,8);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (12,b'0','Explain the general purposes and functions of accounting',0,8);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (13,b'0','Students will use current biochemical and molecular techniques to plan and carry out experiments',0,9);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (14,b'0','Students will explain/describe the synthesis of proteins, lipids, nucleic acids, and carbohydrates',0,9);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (15,b'0','Doctors and scientists hope to use our genetic information to diagnose, treat, prevent and cure many illnesses',0,10);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (16,b'0','Pharmacologists study how drugs work in the body and use this information explore how the body itself functions',0,11);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (17,b'0','Botanists interested in ecology study interactions of plants with other organisms and the environment',0,12);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (18,b'0','Proficiency in A2 French Language',0,13);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (19,b'0','Proficiency in A2 Spanish Language',0,14);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (20,b'0','Proficiency in B2 English Language',0,15);
INSERT INTO `wis`.`outcome`(`id`,`deleted`,`description`,`version`,`course_id`) VALUES (21,b'0','Proficiency in A2 German Language',0,16);


/*Course Realization*/
INSERT INTO `wis`.`course_realization`(`id`,`deleted`,`end_date`,`start_date`,`version`,`course_id`) VALUES (1,b'0','2019-02-03','2019-02-05',0,2);
INSERT INTO `wis`.`course_realization`(`id`,`deleted`,`end_date`,`start_date`,`version`,`course_id`) VALUES (2,b'0','2019-02-03','2019-02-05',0,3);
INSERT INTO `wis`.`course_realization`(`id`,`deleted`,`end_date`,`start_date`,`version`,`course_id`) VALUES (3,b'0','2019-02-03','2019-02-05',0,15);
INSERT INTO `wis`.`course_realization`(`id`,`deleted`,`end_date`,`start_date`,`version`,`course_id`) VALUES (4,b'0','2019-02-03','2019-02-05',0,12);
INSERT INTO `wis`.`course_realization`(`id`,`deleted`,`end_date`,`start_date`,`version`,`course_id`) VALUES (5,b'0','2019-02-03','2019-02-05',0,10);
INSERT INTO `wis`.`course_realization`(`id`,`deleted`,`end_date`,`start_date`,`version`,`course_id`) VALUES (6,b'0','2019-02-03','2019-02-05',0,8);
INSERT INTO `wis`.`course_realization`(`id`,`deleted`,`end_date`,`start_date`,`version`,`course_id`) VALUES (7,b'0','2019-02-03','2019-02-05',0,9);
INSERT INTO `wis`.`course_realization`(`id`,`deleted`,`end_date`,`start_date`,`version`,`course_id`) VALUES (8,b'0','2019-02-03','2019-02-05',0,7);

/*Course Attending*/
INSERT INTO `wis`.`course_attending`(`deleted`, `version`, `student_id`, `course_realization_id`, `grade`) VALUES (b'0', 0,1,1,56);

/*Year of Study*/ /*add courses to years of study*/
INSERT INTO `wis`.`year_of_study` (`deleted`, `number_of_year`, `version`) VALUES (0, 1, 0);
INSERT INTO `wis`.`year_of_study` (`deleted`, `number_of_year`, `version`) VALUES (0, 2, 0);
INSERT INTO `wis`.`year_of_study` (`deleted`, `number_of_year`, `version`) VALUES (0, 3, 0);
INSERT INTO `wis`.`year_of_study` (`deleted`, `number_of_year`, `version`) VALUES (0, 4, 0);

/*Course Type*/
INSERT INTO `wis`.`course_type`(`id`,`deleted`, `name`, `version`) VALUES (1,b'0', 'Practical', 1);
INSERT INTO `wis`.`course_type`(`id`,`deleted`, `name`, `version`) VALUES (2,b'0', 'Exercises', 1);
INSERT INTO `wis`.`course_type`(`id`,`deleted`, `name`, `version`) VALUES (3,b'0', 'Lecture', 1);

/*Course Teaching*/
INSERT INTO `wis`.`course_teaching`(`id`,`deleted`,`number_of_classes`, `version`, `course_realization_id`,`course_type_id`,`teacher_id`) VALUES (1, b'0',12,1,1,2,1);
INSERT INTO `wis`.`course_teaching`(`id`,`deleted`,`number_of_classes`, `version`, `course_realization_id`,`course_type_id`,`teacher_id`) VALUES (2, b'0',10,1,4,3,2);

/*Student Year*/
INSERT INTO `wis`.`student_year`(`id`,`deleted`,`registration_date`, `version`, `student_id`,`year_of_study_id`) VALUES (1, b'0','2014-05-12',1,1,2);
INSERT INTO `wis`.`student_year`(`id`,`deleted`,`registration_date`, `version`, `student_id`,`year_of_study_id`) VALUES (2, b'0','2014-05-12',1,1,1);
INSERT INTO `wis`.`student_year`(`id`,`deleted`,`registration_date`, `version`, `student_id`,`year_of_study_id`) VALUES (3, b'0','2014-05-12',1,2,1);
INSERT INTO `wis`.`student_year`(`id`,`deleted`,`registration_date`, `version`, `student_id`,`year_of_study_id`) VALUES (4, b'0','2014-05-12',1,3,3);

/*Evaluation*/
INSERT INTO `wis`.`evaluation`(`id`,`end_date`,`start_date`, `total_points`, `course_realization_id`) VALUES (1,'2017-01-01','2016-06-12',89,2);
INSERT INTO `wis`.`evaluation`(`id`,`end_date`,`start_date`, `total_points`, `course_realization_id`) VALUES (2,'2017-02-02','2016-08-12',89,7);

/*Evaluation Attending*/
INSERT INTO `wis`.`evaluation_attending`(`id`,`achieved_points`,`note`, `evaluation_id`, `student_year_id`) VALUES (1, 23, 'Nice', 1, 1);
INSERT INTO `wis`.`evaluation_attending`(`id`,`achieved_points`,`note`, `evaluation_id`, `student_year_id`) VALUES (2, 20, 'Good Job', 2, 3);

/*Study Programs*/
INSERT INTO `wis`.`study_program`(`id`,`deleted`,`name`, `faculty_id`, `rukovodilac_id`) VALUES (1, b'0', 'Software Engineering', 1, 1);
INSERT INTO `wis`.`study_program`(`id`,`deleted`,`name`, `faculty_id`, `rukovodilac_id`) VALUES (2, b'0', 'Software Engineering', 4, 1);
INSERT INTO `wis`.`study_program`(`id`,`deleted`,`name`, `faculty_id`, `rukovodilac_id`) VALUES (3, b'0', 'Bio Engineering', 5, 2);
INSERT INTO `wis`.`study_program`(`id`,`deleted`,`name`, `faculty_id`, `rukovodilac_id`) VALUES (4, b'0', 'Business and Accounting', 3, 1);
INSERT INTO `wis`.`study_program`(`id`,`deleted`,`name`, `faculty_id`, `rukovodilac_id`) VALUES (5, b'0', 'Business and Accounting', 6, 2);
INSERT INTO `wis`.`study_program`(`id`,`deleted`,`name`, `faculty_id`, `rukovodilac_id`) VALUES (6, b'0', 'Lower Level Languages', 2, 2);
INSERT INTO `wis`.`study_program`(`id`,`deleted`,`name`, `faculty_id`, `rukovodilac_id`) VALUES (7, b'0', 'Higher Level Languages', 7, 1);

/*Titles of Teachers*/
INSERT INTO `wis`.`title`(`id`,`date_chosen`,`date_stop`, `deleted`, `version`,`teacher_id`) VALUES (1, '2016-05-12', '2016-08-12', b'0',1, 1);
INSERT INTO `wis`.`title`(`id`,`date_chosen`,`date_stop`, `deleted`, `version`,`teacher_id`) VALUES (2, '2014-01-09', '2015-01-12', b'0',1, 2);

/*Title types for Title*/
INSERT INTO `wis`.`title_type`(`deleted`,`name`,`version`, `title_id`) VALUES (b'0', 'Assistant',1,1);
INSERT INTO `wis`.`title_type`(`deleted`,`name`,`version`, `title_id`) VALUES (b'0', 'Professor',1,2);

/*Study Field for Teachers*/
INSERT INTO `wis`.`study_field`(`id`,`deleted`,`name`,`version`, `title_id`) VALUES (1, b'0', 'Economics', 1, 1);
INSERT INTO `wis`.`study_field`(`id`,`deleted`,`name`,`version`, `title_id`) VALUES (2, b'0', 'Software Engineering', 1, 2);

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT;
SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS;
SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION;
SET SQL_NOTES=@OLD_SQL_NOTES;

