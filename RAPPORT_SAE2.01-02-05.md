---
title: "SAé 1.1 : INCAN'S GOLD GAME PROJECT"
author: "Lucas DA SILVA FERREIRA" and "Baptiste FOURNIE"
date: "06/01/2023" #"dd-mm-yyyy" format
---

# **"SAé 1.1 : INCAN'S GOLD GAME PROJECT"**

## **Summary**
* [**Introduction**](#part0)
* [**DEMO**](#demo) **:** _Demonstration Video_
* [**Part 1**](#part1) **:** _What's done in this project?_
* [**Part 2**](#part2) **:** _Tool used_
* [**Part 3**](#part3) **:** _Strategies employed_
* [**Part 4**](#part4) **:** _Difficulties, bugs encountered and solutions_
* [**Conclusion**](#part5)

<hr>

## <a id="part0"></a>**Introduction**

Keep in mind that the following document is meant to guide the reader to understand the project within the frame of the SAE.

Incan Gold is a board game that the player have to explore a mine (in the French version) or a temple (in the English version).

Player have to explore to get diamonds and return to the camp without dying with the loot. When you reach the camp with diamond, your diamonds are saved in your loot chest.

The player who has the highest diamond saved amount winning the game!

UPDATE : You can also check our second MD of the SAE 1.2 in french [**here**](RAPPORT_FOURNIE_DASILVAFERREIRA.md)

<hr>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

## <a id="demo"></a>**Demonstration Video**

[![](ressources/videoembedimg.PNG)](https://youtu.be/LL10PvELnJs)

##### "Click on this [**link**](https://youtu.be/LL10PvELnJs) or on the image to view this video on Youtube..."
##### "Or on this [**link**](ressources/DEMOVIDEO.mp4) if you have network limitations."

<hr>

## <a id="part1"></a>**What's done in this project and not?**

We were really inspired by this project, our love for video game and board game making to us many ideas and graphic concept. But we haven't had the time to make all our ideas like the "Texture pack" option that permits to the user to import his textures to the game and get a personalized game or settings panel to set the game window resolution or it is widowed or not... Especially we expected to have the time to make a tutorial scenario, but not in fact...

We've expected to add audio file to the game to add more spicy content.
Audio demo danger card when appearing [**Click**](ressources/audio.wav) to Listen


But, we have partially finished the game and it gives a correct render with the cards displaying on the board and the two action buttons to interact with the game.

You can also see that the game is robust, the game is compatible with many platforms with a clear terminal function that he recognizes the operating system and run the clear terminal command corresponding to your platform.

Also, we have created many function like <code>**imgdatabase()**</code> | <code>**create_canvas()**</code> | <code>**create_button()**</code> .

Each of theses functions gets the game window arguments from <code>**Settings.py**</code> and display images, button and canvas in a resized or not and with a modified position all proportionally.

Also, the terminal version is complete.

<hr>

## <a id="part2"></a>**Tool Used**

We have used different tools for the development of the project :
* <a href="https://code.visualstudio.com/Download">**Visual Studio Code**</a> (IDE)
* <a href="https://www.jetbrains.com/fr-fr/pycharm/download/#section=windows">**Pycharm**</a> (IDE, For "Code with me" functionality)
* Paint and <a href="https://www.gimp.org/downloads/">**Gimp**</a> (For texture editing)
* Yugioh Card Maker (Card generator <a href="https://ygopro.org/yugioh-card-maker/">**website**</a> for textures)
* Python Tutor (To check script, link to <a href="https://pythontutor.com/python-debugger.html#mode=edit">**website**</a>)
* Tkinter external library (You can install it by using cmd as administrator and executing this following command <code>**pip install Tk**</code>)
* Trello (to share and see our work).

<hr>

## <a id="part3"></a>**Strategies employed**

We have decided to primarily done the level 0 and level 1.
We have used two [**API**](#part2), one is <a href="https://code.visualstudio.com/Download">**Visual Studio Code**</a> for its efficiency and small size.

The other one is <a href="https://www.jetbrains.com/fr-fr/pycharm/download/#section=windows">**Pycharm**</a> for its "Code with me" functionality that permit's us to write code in the same file in real time.

We have worked 1 or 2 hours per day and sometime we have writted code on pycharm to see in real time the code of each others.

<hr>

## <a id="part4"></a>**Difficulties,bugs encountered and solutions**

We met some problems, precisely a problem that it was found on the 17th December of 2022 with the two action buttons that the variable is correctly modified when clicked, but the game cannot get the updated variable to know what the player had choiced. Reading a second time the Tkinter Documentation, I have found that the solution to solve this problem is that we haven't used the <code>**Wait_variable(arg)**</code> function that he gets the variable value when it is modified/updated. In the version uploaded on <a href="https://ecampus.paris-saclay.fr/">**eCampus**</a>, this bug is solved. So you can interact with the board game.

Also, a bug on the player name list was found. If they put the same name, an issue will appear on the diamond score of all players so in the Terminal version uploaded. So we've put a patch to prevent this issue.

A bug if all the player we're leaving the game an error appears because a modulo 0 is present. So we're putting a condition to prevent this and doing all instruction only if it's different from 0.

some bugs is remaining like the screen flickering when we interact to the buttons on main menu, the canvas changing system in fact.
<hr>

## <a id="part5"></a>**Conclusion**

To conclude, this project was really interesting. A lot of additional functionality is present such as an original change of resolution with the python <code>**Settings.py**</code> file. You can also replace all images in the resources folder to change the textures of the game beside of textures pack folder system. The terminal version is complete!


Thanks you for reading this awesome markdown and sees our work actually done!
<hr>

###### This Project was developped by Lucas DA SILVA FERREIRA and Baptiste FOURNIE. Two student of the University Institute of Technology of Vélizy. (2022-2023)