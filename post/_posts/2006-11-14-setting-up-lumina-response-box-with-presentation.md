---
layout: post
title: "setting up Lumina response box with Presentation"
slug: 2006-11-14-setting-up-lumina-response-box-with-presentation
tags: fMRI
---

This is how we set up our [Lumina](http://www.cedrus.com/lumina/) button response box with [Presentation](http://www.neurobs.com/) using the parallel port. <!--more-->

**Hardware:**

* get an RJ45 to D25 connector (e.g. from [Minitran](http://www.minitran.co.uk/pages/products/list.mhtml?ct=1&sc=7&filter=RJ%20-%20D%20Modular%20Adapters&manufacturer=Mini5%2FMinilink))
* connect pin 5 (green cable; trigger pulse)  with pin no. 10 on parallel port
* connect pin 8 (white/grey cable; ground) with pin no. 24 on parallel port

**Use hyperterminal to configure the Lumina response box:**

* start hyperterminal
* click cancel
* File > Properties
* connect using COM1
* set:
  * baud rate = 9600
  * data bits = 8
  * stop bits = 1
  * flow control = none

**Settings Lumina response box:**

- ASCII/MEDX
- 9600 baud

**Configure Presentation:**

1. In *Presentation*, select the *Settings tab* and then select *Response* on the left.
2. Click the *Parallel Port Device* button:
    ![Presentation, Settings tab, Response](https://dl.dropbox.com/u/3579694/marionsmits.net/2006/11/presentation_lumina_1.png)
3. On the *Parallel Input Device* dialogue box, enter the following settings.
    ![Parallel Input Device](https://dl.dropbox.com/u/3579694/marionsmits.net/2006/11/presentation_lumina_2.png)
4. Click *Close*.
5. Click the *Serial Input Device* button:
6. On the *Serial Input Device Settings* dialogue box, enter the following settings.
    ![Serial Input Device Settings](https://dl.dropbox.com/u/3579694/marionsmits.net/2006/11/presentation_lumina_3.png)
7. Click *OK*.
8. Select *Port* on the left, and enter the following settings:
    ![Presentation, Settings tab, Port](https://dl.dropbox.com/u/3579694/marionsmits.net/2006/11/presentation_lumina_4.png)

