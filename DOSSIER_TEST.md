---
title:  Dossier de tests
author: Lucas DA SILVA FERREIRA & Baptiste FOURNIE
---
# Dossier de tests

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'> Nom du projet : SAE_2.01-02-05_RPG-SIMULATOR </td>
            <td style='border: 1px solid black;text-align: left'> Version : 0.0.02a </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'> Document : Dossier de test </td>
            <td style='border: 1px solid black;text-align: left'> Date : 18/05/2023 </td>
        </tr>
        <tr>
            <td colspan=2 style='border: 1px solid black;text-align: left'> Responsables de la rédation : Lucas DA SILVA FERREIRA & Baptiste FOURNIE </td>
        </tr>
    </tbody>
</table>

## Sommaire<!-- omit in toc -->
- [Dossier de tests](#dossier-de-tests)
    - [1. Introduction](#1-introduction)
    - [2. Description de la procédure de test](#2-description-de-la-procédure-de-test)
    - [3. Description des informations à enregistrer pour le test](#3-description-des-informations-à-enregistrer-pour-le-test)
        - [3.1. Campagne de test](#3.1-campagne-de-test)
        - [3.2. Tests](#3.2-tests)
        - [3.3. Résultats](#3.3-résultats)
        - [3.4. Conclusions](#3.4-conclusions)

## 1. Introduction
Ce travail est un projet lié a la SAE 2.01, 2.02 et 2.05. Il consiste à la réalisation d'un simulateur de RPG, ce document est un dossier de test qui consiste a decrire les procédures de tests mises en oeuvre pour le projet uniquement sur le package modèle comme il à été demandé. Le but de ce dossier de test est de verifier si les classes et méthodes ne comportent pas d'erreurs et correspondent a la spécification demandé.

## 2. Description de la procédure de test
Ces tests seront appliqué de manière récursif à chaque ajout de méthode, il sera de la forme d'un cycle en V récursive en somme. Tout les tests faits seront des tests unitaires qui utiliseront la stratégie de la "Boite noire"

## 3. Description des informations à enregistrer pour le test

* ### 3.1 Campagne de test

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Produit testé : </td>
            <td style='border: 1px solid black;text-align: left'>RPG SIMULATOR</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Configuration logicielle : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, OpenJDK 19.02, Windows 10 Professionnal </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Configuration matérielle : </td>
            <td style='border: 1px solid black;text-align: left'>INTEL CORE I7-11800H 16x4.6Ghz, RAM 2x32Gb 3200Mhz DDR4, Geforce RTX 3070 ti</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date de début : 18/05/2023</td>
            <td style='border: 1px solid black;text-align: left'>Date de finalisation : 8/06/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Tests à appliquer : </td>
            <td style='border: 1px solid black;text-align: left'></td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

### 3.2 Tests

#### **CLASSE Quete.java :**

* Choix de partition : Les deux listes contenant que des entiers naturels privés de 0 peut etre chacun divisé en trois sous ensemble. A1 la liste est égale à None , A1 la liste contient un entier , A2 la liste contient deux entiers. a represente la premiére liste , b représente la deuxiéme liste.Quand a n'existe pas , b est obligé d'être None sinon il deviendrait la premiére liste.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : extraitPrecond()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "extraitPrecond()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |             a             |             b             | Résultat attendu |
|:------:|:-------------------------:|:-------------------------:|:----------------:|
|   P0   | a = None ou ensemble vide | b = None ou ensemble vide |    [0,0,0,0]     |
|   P1   |   a contient un entier    | b = None ou ensemble vide |    [i,0,0,0]     |
|   P2   |   a contient un entier    |   b contient un entier    |    [i,0,y,0]     |
|   P3   |   a contient un entier    |   b contient 2 entiers    |    [i,0,y,z]     |
|   P4   |   a contient 2 entiers    | b = None ou ensemble vide |    [i,y,0,0]     |
|   P5   |   a contient 2 entiers    |    b contient 1 entier    |    [i,y,z,0]     |
|   P6   |   a contient 2 entiers    |   b contient 2 entiers    |    [i,y,z,x]     |

| Classe |   a   |   b   | Résultat  |
|:------:|:-----:|:-----:|:---------:|
|   P0   | None  | None  | [0,0,0,0] |
|   P1   |  (1)  | None  | [1,0,0,0] |
|   P2   |  (1)  |  (3)  | [1,0,3,0] |
|   P3   |  (1)  | (3,4) | [1,0,3,4] |
|   P4   | (1,2) | None  | [1,2,0,0] |
|   P5   | (1,2) |  (3)  | [1,2,3,0] |
|   P6   | (1,2) | (3,4) | [1,2,3,4] |

<hr>

* Choix de partition : l'ensemble des entiers naturels n'a pas besoin d'être partitionné.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : extraitPos()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "extraitPos()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe | extraitPos | Résultat attendu |      
|:------:|:----------:|:----------------:|
|   P0   |  "(i,y)"   |      [i,y]       |

| Classe |    a    | Résultat |
|:------:|:-------:|:--------:|
|   P0   | "(2,4)" |  [2,4]   |

<hr>

* Choix de partition : le tableau precond peut etre  partionné en trois ensembles, A1 ne contient que des 0, A2 ne contient pas que des 0 et A3 ne contient 0.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : testprecondition()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "testprecondition() en utilisant la méthode des boites noires."</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe | extraitPos | Résultat attendu |      
|:------:|:----------:|:----------------:|
|   P0   |  "(i,y)"   |      [i,y]       |

| Classe |    a    | Résultat |
|:------:|:-------:|:--------:|
|   P0   | "(2,4)" |  [2,4]   |

<hr>

* Choix de partition : Pour les deux colonnes ont peut les partitionnés en 3 parties, on considère que x et y sont des entiers positifs, x1 est égale à x2, x1 est inférieur à x2, x1 est supérieur à x2 et y1 est égale à y2, y1 est inférieur à y2, y1 est supérieur à y2.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : distanceQuete()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "distanceQuete() en utilisant la méthode des boites noires."</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |   x   |   y   |      Résultat attendu       |
|:------:|:-----:|:-----:|:---------------------------:|
|   P0   | x1=X2 | y1=y2 |              0              |
|   P1   | x1=X2 | y1>y2 |        abs(y1 - y2)         |
|   P2   | x1=X2 | y1<y2 |        abs(y1 - y2)         |
|   P3   | x1>X2 | y1=y2 |        abs(x1 - x2)         |
|   P4   | x1>X2 | y1>y2 | abs(x1 - x2) + abs(y1 - y2) |
|   P5   | x1>X2 | y1<y2 | abs(x1 - x2) + abs(y1 - y2) |
|   P6   | x1<X2 | y1=y2 |         abs(x1-x2)          |
|   P7   | x1<X2 | y1>y2 | abs(x1 - x2) + abs(y1 - y2) |
|   P8   | x1<X2 | y1<y2 | abs(x1 - x2) + abs(y1 - y2) |

| Classe |     x     |     y     | Résultat attendu |
|:------:|:---------:|:---------:|:----------------:|
|   P0   |  x1,x2=2  |  y1,y2=2  |        0         |
|   P1   |  x1,x2=2  | y1=2,y2=1 |        1         |
|   P1   |  x1,x2=2  | y1=1,y2=2 |        1         |
|   P3   | x1=2,x2=1 |  y1,y2=2  |        1         |
|   P4   | x1=2,x2=1 | y1=2,y2=1 |        2         |
|   P5   | x1=2,x2=1 | y1=1,y2=2 |        2         |
|   P6   | x1=1,x2=2 |  y1,y2=2  |        1         |
|   P7   | x1=1,x2=2 | y1=2,y2=1 |        2         |
|   P8   | x1=1,x2=2 | y1=1,y2=2 |        2         |

<hr>

* Choix de partition : On considère que la distance est un entier positif! Elle peut être partitionné en 3. Distance Q1 = Distance Q2 ou Distance Q1 > Distance Q2 ou Distance Q1 < Distance Q2.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : queteProche()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "queteProche() en utilisant la méthode des boites noires."</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe | distance | Résultat attendu |      
|:------:|:--------:|:----------------:|
|   P0   |  Q1 <Q2  |       (Q1)       |
|   P1   | Q1 = Q2  |     (Q1,Q2)      |
|   P2   |  Q1 >Q2  |       (Q2)       |

| Classe |    distance    | Résultat |
|:------:|:--------------:|:--------:|
|   P0   | Q1 = 1, Q2 =2  |   (Q1)   |
|   P1   | Q1 = 1, Q2 = 1 | (Q1,Q2)  |
|   P2   | Q1 = 2, Q2 = 1 |   (Q2)   |

<hr>

* Choix de la partition : I0, I1, I2 et I3 représente chacun un indice du tableau précondition. On considère dans ce choix de partition que true veut dire que l'id de la quête necessaire est faite.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : quetePossible()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "quetePossible() en utilisant la méthode des boites noires."</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |            I0            |            I1            |            I2            |            I3            | Résultat attendu |
|:------:|:------------------------:|:------------------------:|:------------------------:|:------------------------:|:----------------:|
|   P0   |           true           | ensemble de la partition |           true           | ensemble de la partition |       true       |
|   P1   |           true           | ensemble de la partition | ensemble de la partition |           true           |       true       |
|   P2   | ensemble de la partition |           true           |           true           | ensemble de la partition |       true       |
|   P3   | ensemble de la partition |           true           | ensemble de la partition |           true           |       true       |
|   P4   |           true           | ensemble de la partition |          false           |          false           |      false       |
|   P5   | ensemble de la partition |           true           |          false           |          false           |      false       |
|   P6   |          false           |          false           | ensemble de la partition |           true           |      false       |
|   P7   |          false           |          false           |           true           | ensemble de la partition |      false       |
|   P8   |          false           |          false           |          false           |          false           |      false       |

liste id = {1,2,3,4}

| Classe | I0  | I1  | I2  | I3  | Résultat |
|:------:|:---:|:---:|:---:|:---:|:--------:|
|   P0   |  1  |  0  |  3  |  2  |   true   |
|   P1   |  1  |  0  |  6  |  2  |   true   |
|   P2   |  6  |  1  |  2  |  0  |   true   |
|   P3   |  6  |  1  |  3  |  2  |   true   |
|   P4   |  1  |  0  |  8  |  9  |  false   |
|   P5   |  6  |  1  |  8  |  0  |  false   |
|   P6   |  8  |  9  |  6  |  1  |  false   |
|   P7   |  8  |  9  |  0  |  0  |  false   |
|   P8   |  8  |  9  |  6  |  7  |  false   |

<hr>

* Choix de la partition : Les ID sont des entiers positif. Il peut être partitionné en 3 parties. l'ID de this est égale a la quete pointé qui est this. l'ID de la quete this est inférieur a la quete pointé. l'ID de la quete this est supérieur a la quete pointé.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : compareTo()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "compareTo() en utilisant la méthode des boites noires."</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |          id          | Résultat attendu |      
|:------:|:--------------------:|:----------------:|
|   P0   | this.id >parquete.id |        >0        |
|   P1   | this.id =parquete.id |        =0        |
|   P2   | this.id <parquete.id |        <0        |

| Classe |        id        | Résultat attendu |      
|:------:|:----------------:|:----------------:|
|   P0   | this = 2 par = 1 |        1         |
|   P1   | this = 2 par = 2 |        =0        |
|   P2   | this= 1 par = 2  |        -1        |

#### **CLASSE Parcours.java :**

* Choix de la partition : Une TreeSet de toute les quetes du Scénario.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : extraitQuete()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "extraitQuete() en utilisant la méthode des boites noires."</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |   tree set   | Résultat attendu |
|:------:|:------------:|:----------------:|
|   P0   | "(qi,qy,qz)" |     (qy,qz)      |

quete 0 = quete fin

| Classe |   tree set   | Résultat |
|:------:|:------------:|:--------:|
|   P0   | "(q0,q1,q2)" | (q1,q2)  |

<hr>

* Choix de la partition : l'experience acqueri par le joueur et une liste de quete possible. Une partie ou l'experience est infèrieure au prérequis de la quete, un ou elle est égale et une autre ou elle est supérieure. Avec des parties ou des quetes sont possibles ou non.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : queteFinPossibleEfficace()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "queteFinPossibleEfficace() en utilisant la méthode des boites noires."</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |   Experience   | Quete Possible | Résultat attendu |
|:------:|:--------------:|:--------------:|:----------------:|
|   P0   | p.exp>qFin.exp |      true      |       true       |
|   P1   | p.exp=qFin.exp |      true      |       true       |
|   P2   | p.exp<qFin.exp |  peu importe   |      false       |
|   P3   |  peu importe   |     false      |      false       |

liste id = {1,2,3}

| Classe |     Experience     |  Quete Possible   | Résultat |
|:------:|:------------------:|:-----------------:|:--------:|
|   P0   | p = 300, qFin =200 | precond [1,0,3,0] |   true   |
|   P1   | p = 200, qFin =200 | precond [1,0,3,0] |   true   |
|   P2   | p = 150, qFin =200 | precond [4,0,3,0] |  false   |
|   P3   | p = 200, qFin =200 | precond [4,0,3,0] |  false   |

<hr>

* Choix de la partition : comparaison de durée, this inférieur a la durée du parcours, this égale a la duree du parcours et this supérieur a la durée du parcours.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : compareTo()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "compareTo() en utilisant la méthode des boites noires."</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |            duree             | Résultat attendu |      
|:------:|:----------------------------:|:----------------:|
|   P0   | this.duree>parparcours.duree |        >0        |
|   P1   | this.duree=parparcours.duree |        =0        |
|   P2   | this.duree<parparcours.duree |        <0        |

|  Classe  |                 duree                  |         Résultat attendu         |      
|:--------:|:--------------------------------------:|:--------------------------------:|
|    P0    |           this = 20 par = 10           |                10                |
|    P1    |           this = 20 par = 20           |                =0                |
|    P2    |           this= 10 par = 20            |               -10                |

<hr>

* Choix de la partition : On regarde les quêtes réalisables et on regarde s'il sont rajouter dans les quêtes possibles

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : quetesPossibles()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "quetesPossibles() en utilisant la méthode des boites noires."</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe | nbQuetesRéalisables |         Résultat attendu         |
|:------:|:-------------------:|:--------------------------------:|
|   P0   |          0          |      ensemble ne change pas      |
|   P1   |          1          |  ensemble ajoute la dite quete   |
|   P2   |      plusieurs      | ensemble ajoute les dites quetes |

queteFaite = 1,Quete1
quetePossible = (Quete2)
ensQueteNonFaite = (Quete3,Quete4,Quete2)

| Classe | 	nbQuetesRéalisables	 |    Résultat attendu    |
|:------:|:---------------------:|:----------------------:|
|   P0   |           0           |        (Quete2)        |
|   P1   |       (Quete4)        |    (Quete2,Quete4)     |
|   P2   |    (Quete4,Quete3)    | (Quete2,Quete4,Quete3) |

<hr>

* Choix de la partition : On ajoute le temps de la quete en terme de distance par rapport a la quete precedente et de durée.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : ajouteDuree()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "ajouteDuree() en utilisant la méthode des boites noires."</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |       chQuetesFaites       |                                Résultat attendu                                 |
|:------:|:--------------------------:|:-------------------------------------------------------------------------------:|
|   P0   |       ensemble vide        |                    parquete(pos y + pos x + duree parquete)                     |
|   P1   | possède une quete actuelle | abs(parquete(actuelle(pos x + pos y)-ancienne(pos x + pos y) + duree parquete)) |

Parquete position = (2,2)
Parquete duree = 10
Queteactuelle position = (4,1)
Ancienne duree = 10

| Classe |     chQuetesFaites     | Résultat attendu |
|:------:|:----------------------:|:----------------:|
|   P0   |     ensemble vide      |        14        |
|   P1   | possède quete actuelle |        23        | 

<hr>

* Choix de la partition : recupère un entier positif lorsque une quete est prise.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : getQueteActuelle()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "getQueteActuelle()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |          chQueteFaite          |   Résultat attendu    |
|:------:|:------------------------------:|:---------------------:|
|   P0   |         ensemble vide          | IDQueteActuelle = -10 |
|   P1   | possède un ou plusieurs quètes | IDQueteActuelle >= 0  |

| Classe |     chQueteFaite      | Résultat attendu |
|:------:|:---------------------:|:----------------:|
|   P0   |     ensemble vide     |       -10        |
|   P1   | chQueteFaite = {1.Q1} |        1         |

<hr>

* Choix de la partition : Analyse en fonction de l'experience si la quete est possible. L'expérience est divisé en 3 partition d'équivalence. La situation ou l'expérience actuelle est supérieur a la quete de fin. Celle ou elle est égale ou celle ou elle est inférieure. Elle regarde si la quete est possible ou non et regarde si le nombre de quete du scénario moins un est supérieur ou égale au nombre de quete deja faite.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : queteFinPossibleExhaustive()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "queteFinPossibleExhaustive()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |           NbQueteFaite           | Quete Possible |    Experience    | Résultat Attendu |
|:------:|:--------------------------------:|:--------------:|:----------------:|:----------------:|
|   P0   | (NbQueteScenario-1)=NbQueteFaite |      True      | pfinexp>=qfinexp |       True       |
|   P1   | (NbQueteScenario-1)=NbQueteFaite |      True      | pfinexp<qfinexp  |      False       |
|   P2   | (NbQueteScenario-1)>NbQueteFaite |      True      | pfinexp>=qfinexp |      False       |
|   P3   | (NbQueteScenario-1)>NbQueteFaite |      True      | pfinexp<qfinexp  |      False       |
|   P4   | (NbQueteScenario-1)>NbQueteFaite |     False      | pfinexp>=qfinexp |      False       |
|   P5   | (NbQueteScenario-1)>NbQueteFaite |     False      | pfinexp<qfinexp  |      False       |

| Classe |                     NbQueteFaite                      | Quete Possible |         Experience          | Résultat Attendu |
|:------:|:-----------------------------------------------------:|:--------------:|:---------------------------:|:----------------:|
|   P0   | 4=NbQueteFaite = NbQueteScenario, NbQueteScenario = 5 |      True      | pfinexp = 350,qfinexp = 350 |       True       |
|   P1   | 4=NbQueteFaite = NbQueteScenario, NbQueteScenario = 5 |      True      | pfinexp = 300,qfinexp = 350 |      False       |
|   P2   |          5=NbQueteScenario,3 = NbQueteFaite           |     False      | pfinexp = 350,qfinexp = 350 |      False       |
|   P3   |          5=NbQueteScenario,3 = NbQueteFaite           |      True      | pfinexp = 300,qfinexp = 350 |      False       |
|   P4   |          5=NbQueteScenario,3 = NbQueteFaite           |     False      | pfinexp = 350,qfinexp = 350 |      False       |
|   P5   |          5=NbQueteScenario,3 = NbQueteFaite           |     False      | pfinexp = 300,qfinexp = 350 |      False       |

<hr>

* Choix de la partition : parComparatif est un string. On peut le partionné en 3. Soit parCompartif est égal à "duree", soit "nbQuete" ou soit "deplacements".

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : getCle()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "getCle()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |         parComparatif         |    Résultat attendu     |
|:------:|:-----------------------------:|:-----------------------:|
|   P0   |    parcomparatif="duree "     |       this.duree        |
|   P1   |   parcomparatif="nbQuete "    | this.quetefaites.size() |
|   P2   | parcomparatif ="deplacements" |    this.deplacements    |

parcours.duree = 30
parcours.deplacements = 20
parcours.quetesfaites.size() = 5

| Classe |         parComparatif         | Résultat |
|:------:|:-----------------------------:|:--------:|
|   P0   |    parcomparatif="duree "     |    30    |
|   P1   |   parcomparatif="nbQuete "    |    5     |
|   P2   | parcomparatif ="deplacements" |    20    |

<hr>

* Choix de la partition : nbduree ,nbQueteFaite, nbDeplacements sont tous des entiers positifs. durée peut etre partionné en 3, this inférieur a la durée du parcours, this égale a la duree du parcours et this supérieur a la durée du parcours.( meme chose pour nbQueteFaite et Deplacements) et pour parComparatif c'est un string. Il peut etre partionné en 3: Soit parCompartif est égal à "duree", soit "nbQuete" ou soit "deplacements".

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : compareTo()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 2.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "compareTo() en utilisant la méthode des boites noires."</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |           nbduree            |                nbQueteFaite                |                nbDeplacement                 | parComparatif | Résultat attendu |      
|:------:|:----------------------------:|:------------------------------------------:|:--------------------------------------------:|:--------------|:----------------:|
|   P0   | this.duree>parparcours.duree |          ensemble de la partition          |           ensemble de la partition           | duree         |        >0        |
|   P1   | this.duree=parparcours.duree |          ensemble de la partition          |           ensemble de la partition           | duree         |        =0        |
|   P2   | this.duree<parparcours.duree |          ensemble de la partition          |           ensemble de la partition           | duree         |        <0        |
|   P3   |   ensemble de la partition   | this.nbQueteFaite>parparcours.nbQueteFaite |           ensemble de la partition           | nbQuete       |        >0        |
|   P4   |   ensemble de la partition   | this.nbQueteFaite=parparcours.nbQueteFaite |           ensemble de la partition           | nbQuete       |        =0        |
|   P5   |   ensemble de la partition   | this.nbQueteFaite<parparcours.nbQueteFaite |           ensemble de la partition           | nbQuete       |        <0        |
|   P6   |   ensemble de la partition   |          ensemble de la partition          | this.nbDeplacement>parparcours.nbDeplacement | deplacements  |        >0        |
|   P7   |   ensemble de la partition   |          ensemble de la partition          | this.nbDeplacement=parparcours.nbDeplacement | deplacements  |        =0        |
|   P8   |   ensemble de la partition   |          ensemble de la partition          | this.nbDeplacement<parparcours.nbDeplacement | deplacements  |        <0        |

| Classe |      nbduree       |   nbQueteFaite   |   nbDeplacement    | parComparatif | Résultat attendu |      
|:------:|:------------------:|:----------------:|:------------------:|:--------------|:----------------:|
|   P0   | this = 20 par = 10 | this = 2 par = 1 | this = 10 par = 5  | duree         |        10        |
|   P1   | this = 20 par = 20 | this = 2 par = 2 | this = 10 par = 10 | duree         |        0         |
|   P2   | this = 10 par = 20 | this = 1 par = 2 | this = 5 par = 10  | duree         |       -10        |
|   P3   | this = 20 par = 10 | this = 2 par = 1 | this = 10 par = 5  | nbQuete       |        1         |
|   P4   | this = 20 par = 20 | this = 2 par = 2 | this = 10 par = 10 | nbQuete       |        0         |
|   P5   | this = 10 par = 20 | this = 1 par = 2 | this = 5 par = 10  | nbQuete       |        -1        |
|   P6   | this = 20 par = 10 | this = 2 par = 1 | this = 10 par = 5  | deplacements  |        5         |
|   P7   | this = 20 par = 20 | this = 2 par = 2 | this = 10 par = 10 | deplacements  |        0         |
|   P8   | this = 10 par = 20 | this = 1 par = 2 | this = 5 par = 10  | deplacements  |        -5        |

<hr>

* Choix de la partition : Il y a deux partitions, soit ChQueteFaites est vide soit elle possède une quete actuelle.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : ajouterDeplacement()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "ajouterDeplacement() en utilisant la méthode des boites noires."</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |       chQuetesFaites       |                        Résultat attendu                        |
|:------:|:--------------------------:|:--------------------------------------------------------------:|
|   P0   |       ensemble vide        |                    parquete(pos y + pos x )                    |
|   P1   | possède une quete actuelle | abs(parquete(actuelle(pos x + pos y)-ancienne(pos x + pos y))) | 

Parquete position = (2,2)
Queteactuelle position = (4,1)
ancien dépalcement = 4

| Classe |     chQuetesFaites     | Résultat attendu |
|:------:|:----------------------:|:----------------:|
|   P0   |     ensemble vide      |        4         |
|   P1   | possède quete actuelle |        7         |


#### **CLASSE Classement.java :**

* Choix de la partition : Les clés ne sont que des entiers positifs. Et on peut les partitionnés en deux, soit la clé du parcours est deja dans le classement sois il n'est pas déja présent.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : ajout()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "ajout()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe | ContainsKey |                          Résultat Attendu                          |
|:------:|:-----------:|:------------------------------------------------------------------:|
|   P0   |    True     |                           ajout parcours                           |
|   P1   |    False    | création d'une nouvelle liste avec une nouvelle clé et le parcours |

clé_parcours = 20

| Classe |                ContainsKey                |                     Résultat Attendu                     |
|:------:|:-----------------------------------------:|:--------------------------------------------------------:|
|   P0   |      clé_parcours dans le classement      |             Ajout du parcours dans la clé 20             |
|   P1   | clé_parcours n'est pas dans le classement | Création d'une nouvelle liste avec la clé et le parcours |

<hr>

* Choix de la partition : un ou des parcours qui on la plus petite clé

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : afficherClassement()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "afficherClassement()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |                 parcours                  |                   Résultat Attendu                   |
|:------:|:-----------------------------------------:|:----------------------------------------------------:|
|   P0   |    un parcours possède la plus petite     | affiche un seul parcours avec la clé la plus petite  |
|   P1   | plusieurs parcours possède la plus petite | affiche tout les parcours avec la clé la plus petite |

- **/!\ abscence de tableau de données, ceci est un test visuel! /!\**

<hr>

* Choix de la partition : un ou des parcours qui on la plus petite clé. parchoix == 1 ou 2.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : afficherClassement()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 2.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "afficherClassement()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |                   parcours                    | parchoix      | nbSolution                  |                   Résultat Attendu                   |
|:------:|:---------------------------------------------:|:--------------|:----------------------------|:----------------------------------------------------:|
|   P0   |      un parcours possède la plus petite       | 1             | nbsolution<=parcourAfficher | affiche un seul parcours avec la clé la plus petite  |
|   P1   |   plusieurs parcours possède la plus petite   | 1             | nbsolution<=parcourAfficher | affiche tout les parcours avec la clé la plus petite |
|   P2   |    un parcours possède la plus grande clé     | 2             | nbsolution<=parcourAfficher | affiche un seul parcours avec la clé la plus grande  |
|   P3   | plusieurs parcours possède la plus grande clé | 2             | nbsolution<=parcourAfficher | affiche tout les parcours avec la clé la plus grande |
|   P4   |           ensemble de la partition            | ens. de la p. | nbsolution>parcourAfficher  |  affiche le ou les parcours mais lève une exception  |

- **/!\ abscence de tableau de données, ceci est un test visuel! /!\**

#### **CLASSE Algorithme.java :**

* Choix de la partition : Il y a deux partitions, soit il y a plusieurs possibilités de parcours glouton, soit il n'y en a qu'un.

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : solutionGloutonneEfficace()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "solutionGloutonneEfficace()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |                   Scenario                   |     Résultat attendu      |
|:------:|:--------------------------------------------:|:-------------------------:|
|   P0   |  Plusieur possibilités de parcours glouton   |         Parcours          |
|   P1   | Qu'une seule possibilité de parcours glouton | Parcours distance minimal |

| Classe | Scenario  |   Résultat attendu    |
|:------:|:---------:|:---------------------:|
|   P0   | Scenario0 |  Parcours(1,2,4,3,0)  |
|   P1   | Scenario1 | parcours(1,4,3,2,5,0) |

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : solutionGloutonneExhaustive()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "solutionGloutonneExhaustive()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |                        Scenario                        |     Résultat attendu      |
|:------:|:------------------------------------------------------:|:-------------------------:|
|   P0   |  Plusieur possibilités de parcours gloutonExhaustive   |         Parcours          |
|   P1   | Qu'une seule possibilité de parcours gloutonExhaustive | Parcours distance minimal |

| Classe | Scenario  |   Résultat attendu    |
|:------:|:---------:|:---------------------:|
|   P0   | Scenario0 |  Parcours(1,2,4,3,0)  |
|   P1   | Scenario1 | Parcours(1,4,3,2,5,0) |

<hr>

* Choix de la partition : Pour tous les autres méthodes de SolutionsAlgorithme . On va considérer qu'il n'a pas vraiment de partition (Ce qui est vrai avec les scénarios donnés) . On va vérifier grace aux résultats de David Auger si à chaque Algorithme. La méthode trouve la valeur minimale (durée, déplacements , nbQuete) et la valeur maximale sur les 5 premiers Scenarios. Donc il n'y aura pas de premiers tableaux de partitions on passera directement au tableaux de données. (Désolé on pas trouvé d'autres façon).

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : solutionSpeedrunEfficace()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "solutionSpeedrunEfficace()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |  Scenario  |            Résultat            |
|:------:|:----------:|:------------------------------:|
|   P0   | scenario 0 | minduree = 27 , maxduree = 30  |
|   P1   | scenario 1 | minduree = 34 , maxduree =  40 |
|   P2   | scenario 2 | minduree = 80 , maxduree = 106 |
|   P3   | scenario 3 | minduree = 53 , maxduree = 72  |
|   P4   | scenario 4 | minduree = 95 , maxduree =167  | 

<hr>

* Choix de la partition : Voir ici

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : SolutionSpeedrunExhaustive()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "SolutionSpeedrunExhaustive()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |  Scenario  |            Résultat            |
|:------:|:----------:|:------------------------------:|
|   P0   | scenario 0 | minduree = 36 , maxduree = 40  |
|   P1   | scenario 1 | minduree = 34 , maxduree =  40 |
|   P2   | scenario 2 | minduree = 91 , maxduree = 117 |
|   P3   | scenario 3 | minduree = 64 , maxduree = 74  |
|   P4   | scenario 4 | minduree = 115 , maxduree =171 |

<hr>

* Choix de la partition : Voir ici

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : SolutionEfficaceNbQuete()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "SolutionEfficaceNbQuete()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |  Scenario  |             Résultat             |
|:------:|:----------:|:--------------------------------:|
|   P0   | scenario 0 | minnbQuete = 4 , maxnbQuete = 4  |
|   P1   | scenario 1 | minnbQuete= 5 ,  maxnbQuete =  6 |
|   P2   | scenario 2 | minnbQuete = 9 ,  maxnbQuete= 9  |
|   P3   | scenario 3 | minnbQuete = 6 ,  maxnbQuete = 8 |
|   P4   | scenario 4 | minnbQuete = 7 ,  maxnbQuete =10 | 

<hr>

* Choix de la partition : Voir ici

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : SolutionExhaustiveNbQuete()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "SolutionExhaustiveNbQuete()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe |  Scenario  |             Résultat              |
|:------:|:----------:|:---------------------------------:|
|   P0   | scenario 0 |  minnbQuete = 5 , maxbQuete = 5   |
|   P1   | scenario 1 | minnbQuete= 6 ,  maxnbQuete =  6  |
|   P2   | scenario 2 | minnbQuete = 10 ,  maxnbQuete= 10 |
|   P3   | scenario 3 | minnbQuete = 8 ,  maxnbQuete = 8  |
|   P4   | scenario 4 | minnbQuete = 10 ,  maxnbQuete =10 |

<hr>

* Choix de la partition : Voir ici

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : SolutionDeplacementEfficace()</td>
            <td style='border: 1px solid black;text-align: left'>Version : 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Description du test :</td>
            <td style='border: 1px solid black;text-align: left'>Test sur la méthode "SolutionDeplacementEfficace()" en utilisant la méthode des boites noires.</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Ressources requises : </td>
            <td style='border: 1px solid black;text-align: left'>IntelliJ IDEA 2022.3.2, la machine cité plus haut </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable de la campagne de test : </td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
    </tbody>
</table>

| Classe | Scenario| Résultat  |
|:------:|:--------:|:----------------:|
|   P0   | scenario 0 |  minDeplacements = 14 , maxDeplacements = 20|
|   P1   | scenario 1 |  minDeplacements= 17,  maxDeplacements =  23  |
|   P2   | scenario 2  |   minDeplacements = 35 ,  maxDeplacements= 57 |
|   P3   | scenario 3 |   minDeplacements = 26 ,  maxDeplacements = 36 |
|   P4   | scenario 4 |   minDeplacements = 49 ,  maxDeplacements =107 |

### 3.3 Résultats

#### **CLASSE Quete.java :**

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>extraitPrecond()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>18/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systèmatique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>extraitPos()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>18/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systèmatique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>testprecondition()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>18/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systèmatique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>distanceQuete()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>18/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systèmatique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>queteProche()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>18/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systèmatique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>quetePossible()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>18/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systèmatique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>compareTo()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>20/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systèmatique </td>
        </tr>
    </tbody>
</table>

#### **CLASSE Parcours.java :**

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>extraitQuete()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>20/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>queteFinPossibleEfficace()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>20/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>compareTo()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>23/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>quetesPossibles()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>24/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>ajouteDuree()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>24/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>getQueteActuelle()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>26/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>queteFinPossibleExhaustive()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>26/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>getCle()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>30/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>compareTo()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>30/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>ajouterDeplacement()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>31/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

#### **CLASSE Classement.java :**

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>ajout()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>27/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>afficherClassement() VERSION 1.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>27/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>afficherClassement() VERSION 2.0</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>27/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

#### **CLASSE Algorithme.java :**

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>solutionGloutonneEfficace()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>28/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>solutionGloutonneExhaustive()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>28/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>solutionSpeedrunEfficace()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>28/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>SolutionSpeedrunExhaustive()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>28/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test :</td>
            <td style='border: 1px solid black;text-align: left'>SolutionEfficaceNbQuete()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>30/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique</td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : </td>
            <td style='border: 1px solid black;text-align: left'>SolutionExhaustiveNbQuete()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>31/05/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>OK </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>Systématique </td>
        </tr>
    </tbody>
</table>

<hr>

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Identification du test : </td>
            <td style='border: 1px solid black;text-align: left'>SolutionDeplacementEfficace()</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Responsable :</td>
            <td style='border: 1px solid black;text-align: left'>Lucas DA SILVA FERREIRA & Baptiste FOURNIE</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Date d'application du test :</td>
            <td style='border: 1px solid black;text-align: left'>01/06/2023</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Résultat :</td>
            <td style='border: 1px solid black;text-align: left'>non fait</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>non fait</td>
        </tr>
    </tbody>
</table>

### 3.4 Conclusions