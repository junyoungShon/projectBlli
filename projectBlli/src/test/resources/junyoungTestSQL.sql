create table users(
	username varchar2(50) not null primary key,
	password varchar2(100) not null,
	enabled char(1) not null
)
create table authorities(
	username varchar(50) not null,
	authority varchar(50) not null
)

select member_id,member_password,enabled from blli_member where member_id='imvestt@hanmail.net'
select member_id,authority from blli_member_auth where member_id= 'imvest@hanmail.net'