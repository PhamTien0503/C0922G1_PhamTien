use furama;
insert into customer_type 
values 
  (1, 'Diamond'), 
  (2, 'Platinium'), 
  (3, 'Gold'), 
  (4, 'Silver'), 
  (5, 'Member');
  
insert into customer (customer_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id,delete_status)
values  
  (
    1, 'Nguyễn Thị Hào', '1970-11-07', 
    0, '643431213', '0945423362', 'thihao07@gmail.com', 
    '23 Nguyễn Hoàng, Đà Nẵng', 
    5,0
  ),
  (
    2, 'Phạm Xuân Diệu', '1992-08-08', 
    1, '865342123', '0954333333', 'xuandieu92@gmail.com', 
    'K77/22 Thái Phiên, Quảng Trị', 
    3,0
  ), 
  (
    3, 'Trương Đình Nghệ', '1990-02-27', 
    1, '488645199', '0373213122', 'nghenhan2702@gmail.com', 
    'K323/12 Ông Ích Khiêm, Vinh', 
    1,0
  ), 
  (
    4, 'Dương Văn Quan', '1981-07-08', 
    1, '543432111', '0490039241', 'duongquan@gmail.com', 
    'K453/12 Lê Lợi, Đà Nẵng', 
    1,0
  ), 
  (
    5, 'Hoàng Trần Nhi Nhi', '1995-12-09', 
    0, '795453345', '0312345678', 'nhinhi123@gmail.com', 
    '224 Lý Thái Tổ, Gia Lai', 
    4,0
  ), 
  (
    6, 'Tôn Nữ Mộc Châu', '2005-12-06', 
    0, '732434215', '0988888844', 'tonnuchau@gmail.com', 
    '37 Yên Thế, Đà Nẵng', 4,0
  ), 
  (
    7, 'Nguyễn Mỹ Kim', '1984-04-08', 
    0, '856453123', '0912345698', 'kimcuong84@gmail.com', 
    'K123/45 Lê Lợi, Hồ Chí Minh', 
    1,0
  ), 
  (
    8, 'Nguyễn Thị Hào', '1999-04-08', 
    0, '965656433', '0763212345', 'haohao99@gmail.com', 
    '55 Nguyễn Văn Linh, Kon Tum', 
    3,0
  ), 
  (
    9, 'Trần Đại Danh', '1994-07-01', 
    1, '432341235', '0643343433', 'danhhai99@gmail.com', 
    '24 Lý Thường Kiệt, Quảng Ngãi', 
    1,0
  ), 
  (
    10, 'Nguyễn Tâm Đắc', '1989-07-01', 
    1, '344343432', '0987654321', 'dactam@gmail.com', 
    '22 Ngô Quyền, Đà Nẵng', 
    2,0
  );