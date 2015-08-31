---
layout: post
title: "importing DICOM files in dTV.II SR"
slug: 2006-10-15-importing-dicom-files-in-dtvii-sr
tags: DTI
---

[dtV II.SR](http://www.ut-radiology.umin.jp/people/masutani/dTV/dTV_frame-e.htm) is one of the most commonly used fibre tracking tools for deterministic tractography, developed by Yoshitaka Masutani and implemented in [Volume-One](http://www.volume-one.org/). It lets you import your DTI data in DICOM format, but you may encounter problems importing if:

1. your DICOM files are in a folder that is not at the root level.
2. dTV fails to create a temp folder. You can solve this by creating this folder (c:\\temp) yourself.
3. you are not using Windows XP. You will need to install Install .NET Framework ver 1.1 (available from [Microsoft](http://www.microsoft.com/downloads/Search.aspx?displaylang=en)).

See also the [dTV trouble shooting page](http://www.ut-radiology.umin.jp/people/masutani/dTV/dTV_frame-e.htm).
