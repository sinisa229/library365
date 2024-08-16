import { IBook, NewBook } from './book.model';

export const sampleWithRequiredData: IBook = {
  id: 14776,
  title: 'hobnob mmm',
};

export const sampleWithPartialData: IBook = {
  id: 25472,
  title: 'round',
  author: 'anenst wrong probable',
  publisher: 'aw stimulating off',
};

export const sampleWithFullData: IBook = {
  id: 29581,
  title: 'geez meanwhile',
  subTitle: 'geez apud',
  author: 'usefully sometimes worth',
  genre: 'beneath against handsome',
  isbn: 'never',
  numberOfPages: 'babyish',
  publisher: 'truthfully lounge',
  edition: 'duh colorfully',
  format: 'EBOOK',
  description: 'grand whoa',
};

export const sampleWithNewData: NewBook = {
  title: 'predecessor unlike obliterate',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
