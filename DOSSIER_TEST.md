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

### 3.3 Résultats

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
            <td style='border: 1px solid black;text-align: left'>non fait</td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'>Occurences des résultats :</td>
            <td style='border: 1px solid black;text-align: left'>non fait</td>
        </tr>
    </tbody>
</table>

### 3.4 Conclusions