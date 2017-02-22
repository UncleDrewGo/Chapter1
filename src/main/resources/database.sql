CREATE TABLE `customer` (
`id` bigint(20) NOT NULL,
`name` VARCHAR(255) DEFAULT NULL,
`contact` VARCHAR(255) DEFAULT NULL,
`phone` VARCHAR(255) DEFAULT NULL,
`email` VARCHAR(255) DEFAULT NULL,
`remark` text,
`attribute` text,
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `customer` values (1,"customer1","jack","123546","jack@gmail.com",null,null);

insert into `customer` values (2,"customer3","jerry","123546789","jerry@gmail.com",null,null);