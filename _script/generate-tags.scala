/*
 * Generates tag files for tag names used in posts.
 */

import java.io.File
import io.Source
 
val postsDirectory = "post/_posts";
val tagsDirectory = "tag/_posts";
val Tags = """tags:(.*)""".r

def generateTagFile(tag: String): Unit = {
	val tagFile = new File(tagsDirectory, s"2015-01-01-${tag.toLowerCase}.html")
	if (!tagFile.exists) {
    println(s"  generating tag page $tag")
    val out = new java.io.PrintWriter(tagFile)
    out.println(s"""---
    |permalink: tag/${tag.toLowerCase}.html
    |layout: tag
    |title: $tag
    |---
    |{% for post in site.tags.$tag %}
    |{% include post.html %}
    |{% endfor %}
    """.stripMargin)
    out.close()
  }
}

for (file <- new File(postsDirectory).listFiles) {
  if (file.getName().endsWith(".md")) {
//    println(file.getName)

    for (line <- Source.fromFile(file).getLines.drop(1)) {
      line.trim match {
      	case Tags(tags) => {
      		tags.trim.split(""",\s*""").foreach { tag =>
      		  if (tag.contains(" ")) {
      		    println(s"ERROR: tag contains space: $tag")
      		    System.exit(1)
      		  }
      		  else {
              generateTagFile(tag)
      		  }
      		}
      	}
      	case _ => { }
      }
    }
  }
}