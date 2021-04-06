import saspy, pandas
sas = saspy.SASsession(cfgname='oda')
cars = sas.sasdata("CARS","SASHELP")
cars.describe()
