

create table shows(show_id varchar(8) ,s_name varchar(15) not null, s_genre varchar(15) default "entertainment", p_year date not null,telecasting_days varchar(10) default "everyday",channel_id varchar(5), primary key(show_id), foreign key(channel_id) references channel(channel_id) on delete cascade on update cascade)ENGINE=InnoDB;


create table channel(channel_id varchar(5) primary key, channel_name varchar(20) not null ,c_family varchar(20),language varchar(10) not null default "Hindi", adrate_per30sec float)ENGINE=InnoDB;


create table advertisments(ad_id varchar(5), 
		brand_name varchar(20) not null, 
		product_type varchar(20) not null,
        channel_id varchar(5),duration_sec int, primary key(ad_id), foreign key(channel_id) references channel(channel_id) on delete cascade on update cascade)ENGINE=InnoDB; 
        
       
create table agency( agency_id varchar(5),f_ceo varchar(10) , l_ceo varchar(10) not null,primary key(agency_id))ENGINE=InnoDB;

create table productions( production_id varchar(5), f_phead varchar(10), l_phead varchar(10) not null, tstrength int not null default 3,agency_id varchar(5), primary key(production_id), foreign key(agency_id) references agency(agency_id) on delete cascade on update cascade)ENGINE=InnoDB; 
 


INSERT into shows( show_id, s_name, s_genre, p_year, telecasting_days,channel_id) 
values( "s00851", "Khana Khazana", "Cooking", "1993-05-23", "weekend","ch101"),	 
	( "s00852", "24", "Crime","2013-10-07","weekend","ch701"),			 
	( "s12853", "FRIENDS", "Entertainment", "1994-01-28","everyday","ch801"),
    ( "s10854", "10 ka dum", "Games", "2010-09-30","weekend","ch602"), 
	( "s10855", "MAD", "Games", "2001-11-08","weekday","ch602"),		 
	( "s12856", "Tom and Friends", "Cartoon", "2012-12-21","weekday","ch601");	
    
  
Insert into channel(channel_id, channel_name,c_family,language, adrate_per30sec)
values("ch101","Star Plus","STAR India","Hindi",141000),
("ch102","Life OK","STAR India","Hindi",83700),
("ch103","Channel V","STAR India","Hindi",81560),
("ch201","Zee TV", "ZEE Netwoek","Hindi",128450),
("ch202","&TV", "ZEE Netwoek","Hindi",26345),
("ch203","Zee Smile", "ZEE Network","Hindi",56454),
("ch301","Sony TV","Multi Screen Media","Hindi",83300),
("ch302","SAB TV","Multi Screen Media","Hindi",30000),
("ch401","Colors","Viacom 18","Hindi",104500),
("ch402","MTV","Viacom 18","Hindi",23080),
("ch501","DD National","Doordarshan","Hindi",10000),
("ch601","Disney Channel","Disney","E/H",21000),
("ch602","Disney XD","Disney","E/H",15000),
("ch701","Star World","STAR TV","English",25000),
("ch801","ZEE Cafe","Zee Entertainment","English",24500),
("ch901","Aaj Tak","TV Today","Hindi",17700),
("ch111","Star Sports","STAR India","E/H",14350),
("ch121","TLC","Discovery Comm","E/H",11500),
("ch122","Discovey Channel","Discovery Com","E/H",17000);


Insert into advertisments(ad_id,brand_name,product_type,channel_id, duration_sec ) 
values("ad101","Surf Excel","Detergent Powder","ch101", 30), 
	("ad102","Surf Excel","Detergent Bar", "ch601", 23), 
	("ad201","Colgate","Toothpaste", "ch801", 120), 
	("ad301","Snapdeal","Website", "ch602", 78), 
	("ad401","AMITY","Education Body","ch701", 226); 
    
   
INSERT into agency (agency_id, f_ceo, l_ceo) values("a100", "Amarnath", "Shukla"),( "a101", "Solanki", "Nathan"),( "a102", "Purva","Malik"),( "a103", "Kunal", "Nayer"),( "a104", "Ekta", "Kapoor");
    
    
INSERT into productions( production_id, f_phead, l_phead, tstrength,agency_id) 
values( "p0500", "Mayur", "Patel", 13,"a100"), 
( "p0501", "Loy", "Deol", 22,"a100"), 
( "p0502", "Kodi", "Taksa", 17,"a100"), 
( "p0503", "Gopinath", "Biswas", 35,"a100"), 
( "p1504", "Dristi", "Dammi", 09,"a101"), 
( "p1505", "Bhaskar", "Sarasvan", 26,"a101"), 
( "p1506", "Chandra", "Tanu", 41,"a101"), 
( "p1507", "Kumud", "Chand", 39,"a101"), 
( "p2508", "Remo", "Dsouza", 25,"a102"), 
( "p2509", "Sheik", "Umair", 34,"a102"), 
( "p2510", "Satya", "Nadella", 44,"a102"), 
( "p2511", "Padmini", "Priya", 10,"a102"), 
( "p3512", "Elango", "Yateen", 23,"a103"), 
( "p3513", "Giridhar", "Behari", 38,"a103"), 
( "p3514", "Binay", "Gowda", 20,"a103"), 
( "p3515", "Imani", "Vilok", 31,"a103"), 
( "p4516", "Kripa", "Sreerupa", 24,"a104"), 

( "p4517", "Madan", "Patel", 35,"a104"), 
( "p4518", "Lahan","Jaffrey", 05,"a104"), 
( "p4519", "Prathiba", "Ram", 32,"a104"); 
    
    
    
    
