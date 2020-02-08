1.
task parameters
(dependsOn :'taskx')

2.inside task body
dependsOn 'tasky'

3.outside tasks
task4.dependson taskx,tasky
