import { BookFormat } from 'app/entities/enumerations/book-format.model';

export interface IBook {
  id: number;
  title?: string | null;
  subTitle?: string | null;
  author?: string | null;
  genre?: string | null;
  isbn?: string | null;
  numberOfPages?: string | null;
  publisher?: string | null;
  edition?: string | null;
  format?: keyof typeof BookFormat | null;
  description?: string | null;
}

export type NewBook = Omit<IBook, 'id'> & { id: null };
