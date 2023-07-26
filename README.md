# AcceptConditionCheckBox-and-binding <br>
## 1. Accept Condition CheckBox is a checkbox which user needs to tick to sigin in an app <br>
## 2. Binding concept is used to replace findViewById <br>
### To use binding concept in your app follow these steps :- <br>
1. add `buildFeatures {
        viewBinding true
    }` in gradle module file <br>
2. then initialize binding variable like this above onCreate method `lateinit var bindingVar : ActivityMainBinding` <br>
3. then add `bindingVar = ActivityMainBinding.inflate(layoutInflater)
        setContentView((bindingVar.root))   these two line of code below super.onCreate(savedInstanceState)
4. then you can use binding in place of findViewById in this way : <br>
   eg:   `bindingVar.id_btn.setOnClickListener{}` 
   

https://github.com/VarunaBansod/AcceptConditionCheckBox-and-binding/assets/65997106/10d388f1-4a40-495e-b999-9efccd3df07c

