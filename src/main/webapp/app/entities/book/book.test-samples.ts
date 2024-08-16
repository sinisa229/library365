import { IBook, NewBook } from './book.model';

export const sampleWithRequiredData: IBook = {
  id: 14776,
  title: 'hobnob mmm',
  author: 'replacement um',
  genre: 'which plus',
  isbn: 'uh-huh closed thick',
};

export const sampleWithPartialData: IBook = {
  id: 14562,
  title: 'beneath',
  author: 'distinction easily',
  genre: 'gosh uselessly',
  isbn: 'look',
  edition: 'at',
  description: 'knottily',
};

export const sampleWithFullData: IBook = {
  id: 22936,
  title: 'against',
  subTitle: 'yowza never',
  author: 'babyish',
  genre: 'truthfully lounge',
  isbn: 'duh colorfully',
  numberOfPages: 'watery to',
  publisher: 'with',
  edition: 'unlike obliterate hmph',
  format: 'PAPERBACK',
  description: 'tenderly toward',
};

export const sampleWithNewData: NewBook = {
  title: 'negative',
  author: 'overhaul',
  genre: 'umpire beautifully neuter',
  isbn: 'how outplay',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
