---
title: "SAé 2.01-02-05 : RPG SIMULATOR"
author: "Lucas DA SILVA FERREIRA" and "Baptiste FOURNIE"
date: "08/06/2023" #"dd-mm-yyyy" format
---

# **SAé 2.01-02-05 : RPG SIMULATOR**

## **Sommaire**
* [**PARTIE 1 - Introduction**](#part0)
* [**PARTIE 2 - Qualité de Développement**](#part1)
* [**PARTIE 3 - Conception Générale**](#part2)
* [**PARTIE 4 - Conclusion Générale**](#part3)
* [**PARTIE 5 - Annexes**](#part4)

<hr>

## <a id="part0"></a>**Introduction**

La SAé 2.01-02-05 est un projet de réalisation d'une application visant à simuler le comportement d'un joueur dans un scénario de RPG. Lors de ce projet nous avons tout d'abord réaliser toute la partie Gestion et Organisation de ce dernier. On entend bien ici que ce projet est un projet transversale d'une part qu'elle est l'ensemble de 3 SAés et regroupant plusieurs ressources d'enseignements de ce Semestre 2.

Le "RPG SIMULATOR" est une application de simulation de RPG qui permet de simuler dans un ou plusieurs contexte de scénario, un ou plusieurs parcours avec différent comportements selon la sélection de l'utilisateur.

Les scénarios fournies vont du "scénario_0.txt" au "scenario_10.txt", l'application possède différents paramètrages dont celle de choisir entre des parcours efficaces ou exhaustives, des parcours en terme de durée, de nombre de quêtes ou bien de déplacements. On peux choisir également entre les pires ou les meilleures solutions selon les choix précédents.

<hr>

## <a id="part1"></a>**Qualité de Développement**

**Cycle de vie du projet :**
Nous avons décider de réaliser ce projet dans cycle en V récursif, dans l'intêret d'avoir le plus agilité sur notre projet. Car la conception était pas sûre et le cycle en V récursif nous permettait de tester et réaliser le code méthode par méthode et si besoin, réaliser une modification du même nom mais en "VERSION 2.0".

**Repartition des tâches :**
Le projet à été réaliser par les deux membre du groupes, la base du programme telle ce qui défini les Quetes "Quete.java", les Scénarios "Scenario.java", la lecture des Scénarios "lectureFichierTexte.java", le Classement "Classement.java" et aussi la partie Interface Homme-Machine (IHM) ont été réalisés par les deux membres. Puis les Algorithmes ont été réalisés par Baptiste FOURNIE. Les tests en générale ont été réalisés par Lucas DA SILVA FERREIRA. La rédaction du dossier de test à été rédiger pour la quasi totalité par Lucas DA SILVA FERREIRA.

Les commits sont visibles comme étant à 100% fait par Lucas DA SILVA FERREIRA, mais en réalités due a l'utilisation de la fonction "Code with me" de IntelliJ, les commits sont fait par Lucas DA SILVA FERREIRA (hôte de la session CODE WITH ME) mais pas forcément écris par ce dernier.

**Outils utilisés :**
Le projet à necessité plusieurs outils et fonctionnalités, telles que :
* <a href="https://junit.org/junit5/">JUnit 5</a> : Pour l'implementation des tests.
* <a href="https://www.jetbrains.com/fr-fr/idea/">IntelliJ</a> : Pour sa fonctionnalité "Code With Me" très utile pour développer sur le même projet en temps réel.
* <a href="https://staruml.io/">StarUML</a> : Pour la réalisation des Diagrammes de classes.
* <a href="https://code.visualstudio.com/Download">Visual Studio Code</a> : Pour la réalisation des Markdowns et permettre que les changements soit visibles puis implémentation de chaque changement par copier/collés sur IntelliJ.
* <a href="https://github.com/GitHub">GitHub</a> : Pour le versionnage du projet.

**Méthode de développement :**
Nous avons préféré pour une meilleure agilité, de conduire notre projet sur une méthode de développement agiles et qu'elle soit piloté par les tests réalisés AVANT la progammation du code devant répondre au besoin. Cela permet d'adopter une agilité pratique dans l'eventualité de proceder à des changements en cas de problèmes et de pas perdre en tête la spécification à répondre au cours du projet.

**Définitions liés à la "Méthode de développement" :**
Développement piloté par les tests (Test-Driven Development, TDD) : Le TDD est une approche de développement qui consiste à écrire des tests automatisés avant d'écrire le code. Cette méthode met l'accent sur la qualité du code en veillant à ce qu'il réponde aux exigences spécifiées par les tests. Le TDD favorise une meilleure couverture de test et une réduction des erreurs introduites lors de l'écriture du code.

Méthodes agiles : Les méthodes agiles, telles que Scrum ou Kanban, mettent l'accent sur la collaboration, la flexibilité et l'itération rapide. Elles encouragent la communication régulière entre les membres de l'équipe de développement, la livraison fréquente de fonctionnalités fonctionnelles et l'adaptation aux changements. Les méthodes agiles favorisent une approche itérative de développement qui permet de détecter et de résoudre les problèmes de qualité plus tôt dans le processus.

<hr>

## <a id="part2"></a>**Conception Générale**

**Diagramme de Haut Niveau :**

Le diagramme de haut niveau permet de voir toutes les classes mais sans leur attributs, ni leurs méthodes.

MODELE :

[![](mdsrc/MODELE1.PNG)]()

VUE :

[![](mdsrc/VUE1.PNG)]()

CONTROLEUR :

[![](mdsrc/CONTROLEUR1.PNG)]()

**Diagramme de Bas Niveau :**

Le diagramme de bas niveau permet de voir toutes les classes avec leur attributs et leurs méthodes.

MODELE :

[![](https://github.com/Gascor/SAE_2.01-02-05_RPG-SIMULATOR/blob/master/mdsrc/MODELE2.png)]()

VUE :

[![](https://github.com/Gascor/SAE_2.01-02-05_RPG-SIMULATOR/blob/master/mdsrc/VUE2.png)]()

CONTROLEUR :

[![](https://github.com/Gascor/SAE_2.01-02-05_RPG-SIMULATOR/blob/master/mdsrc/CONTROLEUR2.png)]()


**Structure de données et stratégies algorithmiques :**
A travers plusieurs extraits d'algorithmes

<hr>

## <a id="part3"></a>**Conclusion Générale**



<hr>

## <a id="part4"></a>**Annexes**

Vous trouverez [**ici**](https://github.com/Gascor/SAE_2.01-02-05_RPG-SIMULATOR), le Git du projet "SAE_2.01-02-05_RPG-SIMULATOR".

Vous trouverez [**ici**](https://github.com/Gascor/SAE_2.01-02-05_RPG-SIMULATOR/blob/master/DOSSIER_TEST.md), le dossier de test "DOSSIER_TEST.md". Pour des raisons de légèreté du rapport et que le dossier de TEST possède l'équivalent de 35 pages PDF, on a préfére disposer ce lien.

Merci d'avoir lu ce rapport de projet et de voir ce projet finalisé!

<hr>

###### Ce projet à été réaliser par Lucas DA SILVA FERREIRA et Baptiste FOURNIE. Deux étudiants de l'Institut Universitaire de Technologie de Velizy. (2022-2023), le 08/06/2023 à l'IUT de Vélizy.
