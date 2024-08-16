import { IUser } from './user.model';

export const sampleWithRequiredData: IUser = {
  id: 9028,
  login: 'V@Pi',
};

export const sampleWithPartialData: IUser = {
  id: 8784,
  login: 'BA{ina@2Mf\\iCk7-\\&-gEIa',
};

export const sampleWithFullData: IUser = {
  id: 13969,
  login: 'Co',
};
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
