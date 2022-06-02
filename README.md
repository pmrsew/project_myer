# project_myer
---
#### General Overview
* This application is an advanced to do list application
* Functionality:
	* Store tasks in pools
		* Tasks can be reoccuring or have a due date, but neither is neccesary
	* Then, create daily templates, based on general routines that vary on energy
		* These templates can be a mix of single tasks, task pools, and events
		* Single tasks are added as themselves into the template
		* Task pools are added to the template with amount limits (Example: You have a care task pool including laundry, dishes, and vacuuming. You are creating a template for a low spoon day, so you add a limit of one task to be pulled from the pool into the template when the daily list is created (explained later))
		* TO BE ADDED IN LATER VERSION: Events are similar to tasks, but aren't added until the day is created. Instead, a slot is reserved in the daily list generated
	* Once data is set up, application is ready to be used
		* When first navigating into the daily list, prompt for which template to use
			"What kind of day am I having today?"
		* This is where the application gets pretty neat: After selecting a template, a daily list is created
			* Single tasks are self explainatory
			* Task pools are added via switch statement depending on context:
				* An ordered task pool means the tasks must be worked from top to bottom, they get added in order until the amount limit set in the template is reached
				* An unordered, non-reoccuring task pool means the tasks are selected in general randomly, but also keeping in mind of tracked skips (explained later)
				* An unordered, reoccuring task pool will use an algorithm. This algorithm will take into account skips (skips explained later) in comparison to reoccurance schedule, tasks with due dates as well
		* Once created, it will display check marks next to tasks and completion percents next to task pool names.
			* When events are added, it will go here
		* Now, list is generated to be used. Check off tasks as you go throughout your day. Hopefully you will be able to better complete a list having chose from templates.
		* Time for more neat stuff! Information is tracked for graphic reports and for use in the algorithm
			* Completion is tracked
			* Amount of skips are tracked
			* Template use is tracked (template color setting that can be reflected here)
			* Inactive use is tracked (of the whole app)
			* Event frequency
			* time to complete a template (from generation to submission)
		* That information is recorded when the daily list is submitted
			* Prior to submission, list completetion can be fully cleared or fully selected
			* Can submit early in day and generate a new daily list (this has some tracking adjustments) or leave same list in app for multiple days
		
#### Settings to jot down:
* Dyslexia font option, more font options? Bionic reading!
* Color themes: Dark (strictly black, gray, and white), Dark High Contrast (has colors)
		
#### Functions to add later:
* Integrated food menu options that pull from a pool
* Habit tracking (mark single tasks as habits to be tracked)
