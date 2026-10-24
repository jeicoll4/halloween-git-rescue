# Bloc 1: Invocació del Repositori i Línia Base

## Acció 3.1 — Creació del repositori local

He creat la carpeta server-room-horror i he inicialitzat
el repositori.

```bash
git init
```

![Inicialització del repositori](captures/image(20261024-132355).png)

## Acció 3.2 — Configuració de l'autor

He configurat el nom i el mail.

```bash
git config --local user.name "Joan Coll"
git config --local user.email "joancollserrat4@gmail.com"
```

![Configuració de l'autor](captures/image(20261024-133047).png)

## Acció 3.3 — Programa inicial i primer commit

He creat Main.java amb un programa.
He preparat el fitxer i he registrat la versió inicial.

```bash
git add .
git commit -m "creacio programa inicial(main.java)"
git lg
```

![Primer commit del programa](captures/image(20261024-135750).png)

## Acció 3.4 — Incorporació dels estats de seguretat

He incorporat una variable booleana que representa
l'alarma activa i ho he registrat en el segon commit.

```bash
git add .
git commit -m "afegeix boolean alarma"
```

![Segon commit: alarma](captures/image(20261024-140426).png)

Després he incorporat una variable booleana que representa
l'accés restringit i ho he registrat en
el tercer commit.

Aquestes variables simulen els estats de seguretat de l'edifici.

```bash
git add .
git commit -m "afegeix boolean acces"
```

![Tercer commit: accés restringit](captures/image(20261024-140756).png)

## Acció 3.5 — Consulta de l'historial

He comprovat que hi apareixen els tres commits inicials: 
el programa base, l'alarma i l'accés restringit.

```bash
git lg
```

![Historial amb els tres commits inicials](captures/image(20261024-140945).png)