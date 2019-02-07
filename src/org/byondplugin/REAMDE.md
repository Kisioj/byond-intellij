If you want to recreate DMLexer.java and DMParser.Java then:

$ antlr4 -visitor -o path_to_gen_org_byondplugin -package org.byondplugin DM.g4

If you want to test grammar afterwards:

$ cd path_to_gen_org_byondplugin
$ javac *.java
$ grun DM start testfile.dm -tokens
$ grun DM start testfile.dm -gui
