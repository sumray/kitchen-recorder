package zq.project.kitchen.recipe;

import java.util.List;

public class CreateRecipeRequest {

	private String recipeName;

	private List<String> tagNames;

	private String ingredients;

	private String processDesc;

	private RecipeMode mode;

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public List<String> getTagNames() {
		return tagNames;
	}

	public void setTagNames(List<String> tagNames) {
		this.tagNames = tagNames;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getProcessDesc() {
		return processDesc;
	}

	public void setProcessDesc(String processDesc) {
		this.processDesc = processDesc;
	}

	public RecipeMode getMode() {
		return mode;
	}

	public void setMode(RecipeMode mode) {
		this.mode = mode;
	}

}

