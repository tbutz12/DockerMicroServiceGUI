import saspy
sas = saspy.SASsession(cfgname='oda')
cars = sas.sasdata("CARS","SASHELP")
cars.describe()
