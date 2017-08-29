import jenkins.model.Jenkins;
pm = Jenkins.instance.pluginManager
def pluginList = []
pm.plugins.each { plugin ->
  pluginList.add("${plugin.shortName}:${plugin.version}")
}
Collections.sort(pluginList)
pluginList.each {
  println it
}