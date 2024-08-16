import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: '27d01fa7-0ebb-4c66-9c5f-5b2bd57fa827',
};

export const sampleWithPartialData: IAuthority = {
  name: 'b3fe4a80-0e9c-4ca9-a552-82e0a6396828',
};

export const sampleWithFullData: IAuthority = {
  name: '2f48a3cf-082d-4dba-872e-9e33d8efd43f',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
