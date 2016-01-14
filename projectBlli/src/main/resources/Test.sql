create table test(
	content clob not null
)
select * from test;
select content from(
	select content, rownum from test
)where rownum = 1