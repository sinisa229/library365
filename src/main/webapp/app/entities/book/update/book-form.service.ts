import { Injectable } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

import { IBook, NewBook } from '../book.model';

/**
 * A partial Type with required key is used as form input.
 */
type PartialWithRequiredKeyOf<T extends { id: unknown }> = Partial<Omit<T, 'id'>> & { id: T['id'] };

/**
 * Type for createFormGroup and resetForm argument.
 * It accepts IBook for edit and NewBookFormGroupInput for create.
 */
type BookFormGroupInput = IBook | PartialWithRequiredKeyOf<NewBook>;

type BookFormDefaults = Pick<NewBook, 'id'>;

type BookFormGroupContent = {
  id: FormControl<IBook['id'] | NewBook['id']>;
  title: FormControl<IBook['title']>;
  subTitle: FormControl<IBook['subTitle']>;
  author: FormControl<IBook['author']>;
  genre: FormControl<IBook['genre']>;
  isbn: FormControl<IBook['isbn']>;
  numberOfPages: FormControl<IBook['numberOfPages']>;
  publisher: FormControl<IBook['publisher']>;
  edition: FormControl<IBook['edition']>;
  format: FormControl<IBook['format']>;
  description: FormControl<IBook['description']>;
};

export type BookFormGroup = FormGroup<BookFormGroupContent>;

@Injectable({ providedIn: 'root' })
export class BookFormService {
  createBookFormGroup(book: BookFormGroupInput = { id: null }): BookFormGroup {
    const bookRawValue = {
      ...this.getFormDefaults(),
      ...book,
    };
    return new FormGroup<BookFormGroupContent>({
      id: new FormControl(
        { value: bookRawValue.id, disabled: true },
        {
          nonNullable: true,
          validators: [Validators.required],
        },
      ),
      title: new FormControl(bookRawValue.title, {
        validators: [Validators.required],
      }),
      subTitle: new FormControl(bookRawValue.subTitle),
      author: new FormControl(bookRawValue.author, {
        validators: [Validators.required],
      }),
      genre: new FormControl(bookRawValue.genre, {
        validators: [Validators.required],
      }),
      isbn: new FormControl(bookRawValue.isbn, {
        validators: [Validators.required],
      }),
      numberOfPages: new FormControl(bookRawValue.numberOfPages),
      publisher: new FormControl(bookRawValue.publisher),
      edition: new FormControl(bookRawValue.edition),
      format: new FormControl(bookRawValue.format),
      description: new FormControl(bookRawValue.description),
    });
  }

  getBook(form: BookFormGroup): IBook | NewBook {
    return form.getRawValue() as IBook | NewBook;
  }

  resetForm(form: BookFormGroup, book: BookFormGroupInput): void {
    const bookRawValue = { ...this.getFormDefaults(), ...book };
    form.reset(
      {
        ...bookRawValue,
        id: { value: bookRawValue.id, disabled: true },
      } as any /* cast to workaround https://github.com/angular/angular/issues/46458 */,
    );
  }

  private getFormDefaults(): BookFormDefaults {
    return {
      id: null,
    };
  }
}
