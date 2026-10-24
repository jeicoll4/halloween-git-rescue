# Bloc 2: Les Branques del Més Enllà i Resolució del Conflicte

## Acció 3.6 — Crear les branques

He creat dues branques des del mateix commit de master
per treballar amb una base comuna i fer canvis independents.

```bash
git branch feature-nightmare
git branch feature-sanctuary
git branch
```

![Creació de les branques](captures/image(20261024-141438).png)

## Acció 3.7 — Desactivar l'alarma

He canviat a feature-nightmare, he posat l'alarma a false
i he registrat el canvi amb un commit.

```bash
git switch feature-nightmare
git add Main.java
git commit -m "Desactiva alarma (false)"
```

![Commit de la branca fosca](captures/image(20261024-142044).png)

## Acció 3.8 — Protegir l'alarma

A feature-sanctuary he modificat la mateixa línia:
he mantingut l'alarma a true i he afegit final per impedir
que es reassignin les variables. He registrat el canvi.

```bash
git switch feature-sanctuary
git add .
git commit -m "Protegeix (final) alarma"
```

![Commit del santuari](captures/image(20261024-150726).png)

## Acció 3.9 — Fusionar les branques

He integrat feature-nightmare a master amb fast-forward.
En integrar feature-sanctuary, ha aparegut un conflicte
perquè les dues branques havien modificat la mateixa línia.

```bash
git switch master
git merge feature-nightmare
git merge feature-sanctuary
```

![Conflicte durant la fusió](captures/image(20261024-151058).png)

## Acció 3.10 — Resoldre el conflicte

He eliminat manualment les marques del conflicte i he conservat
l'alarma activada amb final. He fet el commit per acabar la fusió.

```bash
git add .
git commit -m "resolt conflicte de branques"
```

![Commit de resolució del conflicte](captures/image(20261024-151403).png)