#tabla comunidades
INSERT INTO comunidad(comunidad) VALUES ('Galicia');
INSERT INTO comunidad(comunidad) VALUES ('Mallorca');

#tabla tipos
INSERT INTO tipo(tipo) VALUES ('Apartamento');
INSERT INTO tipo(tipo) VALUES ('Casa Rural');
INSERT INTO tipo(tipo) VALUES ('Habitacion hotel');
INSERT INTO tipo(tipo) VALUES ('Motel');

#tabla caracteristicas
INSERT INTO caracteristicas(wifi,parking,piscina,mascotas,gimnasio,spa) VALUES (1,0,1,1,0,0);
INSERT INTO caracteristicas(wifi,parking,piscina,mascotas,gimnasio,spa) VALUES (1,1,1,1,1,1);
INSERT INTO caracteristicas(wifi,parking,piscina,mascotas,gimnasio,spa) VALUES (0,1,0,0,0,0);
INSERT INTO caracteristicas(wifi,parking,piscina,mascotas,gimnasio,spa) VALUES (1,0,1,0,0,0);
INSERT INTO caracteristicas(wifi,parking,piscina,mascotas,gimnasio,spa) VALUES (0,0,1,1,0,0);

#tabla alojamientos
INSERT INTO alojamientos(titulo, descripcion, comunidad, tipo, valoracion, caracteristicas, desayuno, imagen, anadido) VALUES ('Apartamento con vistas al mar','Apartamento con tres habitaciones, dos baños y unas espectaculares vistas al mar.',1,2,4,1,true,'https://via.placeholder.com/360x180?text=Imagen_1','1 de febrero de 2021');
INSERT INTO alojamientos(titulo, descripcion, comunidad, tipo, valoracion, caracteristicas, desayuno, imagen, anadido) VALUES ('Apartamento con vistas a la ría','Apartamento con tres habitaciones, dos baños y unas espectaculares vistas al mar.',1,2,4,2,true,'https://via.placeholder.com/360x180?text=Imagen_2','1 de febrero de 2021');
INSERT INTO alojamientos(titulo, descripcion, comunidad, tipo, valoracion, caracteristicas, desayuno, imagen, anadido) VALUES ('Apartamento con vistas al monte','Apartamento con tres habitaciones, dos baños y unas espectaculares vistas al mar.',2,1,4,3,true,'https://via.placeholder.com/360x180?text=Imagen_3','1 de febrero de 2021');
INSERT INTO alojamientos(titulo, descripcion, comunidad, tipo, valoracion, caracteristicas, desayuno, imagen, anadido) VALUES ('Apartamento con vistas a la fuente','Apartamento con tres habitaciones, dos baños y unas espectaculares vistas al mar.',1,3,4,4,true,'https://via.placeholder.com/360x180?text=Imagen_4','1 de febrero de 2021');
INSERT INTO alojamientos(titulo, descripcion, comunidad, tipo, valoracion, caracteristicas, desayuno, imagen, anadido) VALUES ('Apartamento con vistas al río','Apartamento con tres habitaciones, dos baños y unas espectaculares vistas al mar.',2,2,4,5,true,'https://via.placeholder.com/360x180?text=Imagen_5','1 de febrero de 2021');

