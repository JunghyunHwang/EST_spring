  -- 상품테이블
drop table t_order purge;
drop table t_product  purge;

create table t_product
(
    pcode  varchar2(10) primary key,
    pname varchar2(10),
    price number(4),
    quantity number(4)
);

-- 주문 테이블   
create table t_order
(
    num number(4) primary key,
    pcode  varchar2(10) references t_product(pcode),
    quantity number(4)
); 
    
create sequence t_order_seq;

insert into t_product(pcode, pname, price, quantity) values ('p01', 'TV', 1000, 10);
insert into t_product(pcode, pname, price, quantity) values ('p02', 'iPhone', 500, 5);
insert into t_product(pcode, pname, price, quantity) values ('p03', 'G3', 600, 20);

commit;