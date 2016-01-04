package com.raidentrance.builder;

import com.google.common.base.Preconditions;
import com.raidentrance.builder.commons.AbstractBuilder;
import com.raidentrance.model.Book;

public class BookBuilder extends AbstractBuilder<Book> {

	public BookBuilder() {
		super(new Book());
	}

	public BookBuilder setIsbn(String isbn) {
		instance.setIsbn(isbn);
		return this;
	}

	public BookBuilder setTitle(String title) {
		instance.setTitle(title);
		return this;
	}

	public BookBuilder setAuthor(String author) {
		instance.setAuthor(author);
		return this;
	}

	public BookBuilder setPrice(double price) {
		instance.setPrice(price);
		return this;
	}

	@Override
	public void validate() {
		Preconditions.checkNotNull(instance.getIsbn());
	}

	@Override
	public void inject() {

	}

}
