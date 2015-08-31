---
layout: post
title: "highlighting fMRI activation"
slug: 2006-10-31-fmri-and-adobe-photoshop
tags: fMRI
---

Not too happy with greyscale fMRI overlays?

Here's how to easily highlight them in colour (using Adobe Photoshop):

1. Duplicate the background layer
2. Use the magic wand to select the areas of activation (hold down Shift for multiple selections; reduce the tolerance from 30 to 10 at the edges)
3. Shift-Ctrl-I (inverse selection)
4. Delete
5. Shift-Ctrl-I (inverse selection again)
6. Ctrl-L (output levels)
7. Set output levels for Ctrl-1 (red) to 255/255 and Ctrl-3 (blue) to 0/0
6. Ctrl-U saturation to -30
7. Ctrl-Alt-D (feather) at 5 pixels
8. Save

All set for a flash presentation!


