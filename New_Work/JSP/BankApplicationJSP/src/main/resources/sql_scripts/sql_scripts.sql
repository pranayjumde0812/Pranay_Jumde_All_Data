create database bankapplication_jsp;

use bankapplication_jsp;

create table bank_account(user_id int primary key auto_increment,
                          account_number varchar(20) not null unique key,
						  user_password varchar(20),
                          user_name varchar(30),
                          address varchar(100),
                          city varchar(20),
                          balance double,
                          isApproved int(1),
                          created_by int,
                          updated_by int,
                          created_at timestamp,
                          updated_at timestamp);

create table transaction_details(transaction_id int primary key,
								 user_id int,
                                 transaction_date date,
                                 amount double,
                                 transation_type varchar(10),
                                 foreign key(user_id) references bank_account(user_id));

create table logs_details(log_id int primary key,
						  task_performed varchar(20),
                          user_id int,
                          log_time timestamp,
                          foreign key(user_id) references bank_account(user_id));