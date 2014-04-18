package com.example.tokka;

import java.util.ArrayList;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Component;
import com.vaadin.ui.PopupView.Content;

@SuppressWarnings("serial")
public class MenuView extends NavigationView {
	final VerticalComponentGroup content = new VerticalComponentGroup();

	public MenuView() {
		setCaption("Menu");
		TodoManager.Initialize();
		updatelist();
		
		/*
		NavigationButton button = new NavigationButton("Edit");
		button.addClickListener(new NavigationButtonClickListener() {
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().navigateTo(new FormView());
			}
		});
		 */
		
		
		Button editButton = new Button("Edit");
		editButton.addClickListener(new ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				getNavigationManager().navigateTo(new EditListView());
			}
		});

		setRightComponent(editButton);

		//content.addComponent(button);
		setContent(content);
	};
	
	
	public void updatelist() {
		content.removeAllComponents();
		ArrayList<TodoList> todolists = TodoManager.getTodoLists();
		
		for (int i = 0; i < todolists.size(); i++) {
			TodoList todoList = todolists.get(i);
			
			final NavigationButton button = new NavigationButton(todoList.getListname() + " " + Integer.toString(todoList.getDoneTodos()) + "/" + Integer.toString(todoList.getSize()));
			button.setData(todoList);
			button.addClickListener(new NavigationButtonClickListener() {
				@Override
				public void buttonClick(NavigationButtonClickEvent event) {
					getNavigationManager().navigateTo(new EditTodoView((TodoList)button.getData()));
				}
			});
			content.addComponent(button);
		}
	}
	
    @Override
    protected void onBecomingVisible() {
		updatelist();
    }
}
