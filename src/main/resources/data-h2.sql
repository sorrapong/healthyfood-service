INSERT INTO foods(name, image, links) VALUES('Chickpea Lettuce Wraps', FILE_READ('~/Desktop/image/menu1.jpg'), 'https://showmetheyummy.com/healthy-chickpea-lettuce-wraps');
INSERT INTO foods(name, image, links) VALUES('Oven-Baked Tostadas', FILE_READ('~/Desktop/image/menu2.jpg'), 'https://www.yellowblissroad.com/10-minute-oven-baked-tostadas/?m');
INSERT INTO foods(name, image, links) VALUES('Chicken Caprese Sandwich', FILE_READ('~/Desktop/image/menu3.jpg'), 'https://iowagirleats.com/15-minute-open-face-chicken-caprese-sandwiches/');
INSERT INTO foods(name, image, links) VALUES('Turkey Tomato Panini', FILE_READ('~/Desktop/image/menu4.jpg'), 'http://www.spachethespatula.com/turkey-and-tomato-panini/#_a5y_p=2276306');

INSERT INTO user (username,password,name,email) VALUES('admin','password','ADMIN','admin@test.com')