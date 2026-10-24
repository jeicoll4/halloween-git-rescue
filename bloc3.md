# Bloc 3: Viatge Temporal, Exorcisme del Codi i Publicació Remota

## Acció 3.11 — Crear el commit infectat

He afegit una excepció no gestionada a Main.java per simular
una fallada del servidor i he guardat el canvi amb un commit.

```bash
git add .
git commit -m "feat: unhandled spectral exception"
```

![Commit infectat](captures/image(20261024-202027).png)

## Acció 3.12 — Comparar les versions

He comparat el commit segur anterior amb l'infectat.
La diferència mostra la línia afegida que provoca l'excepció.

```bash
git --no-pager diff HEAD~1 HEAD -- Main.java
```

![Diferència del codi infectat](captures/image(20261024-202403).png)

## Acció 3.13 — Recuperar l'estat segur

He tornat al commit anterior amb reset --hard.
Això ha restaurat el codi segur i ha retirat el commit
infectat de l'historial de master.

```bash
git reset --hard HEAD~1
git lg
```

![Retorn al commit segur](captures/image(20261024-205524).png)

## Acció 3.14 — Comprovar l'arbre final

He comprovat que no hi ha canvis pendents i he mostrat
l'arbre de branques i la fusió, sense el commit infectat.

```bash
git status
git lg
```

![Arbre final del repositori](captures/image(20261024-210358).png)

## Acció 3.15 — Crear el repositori públic

He creat un repositori públic a GitHub anomenat
halloween-git-rescue per publicar el projecte.

He vinculat el repositori local amb GitHub i he publicat
master i les dues branques de treball.

![Publicació del repositori](captures/3.15-publicacio.png)