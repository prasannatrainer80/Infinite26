import { TestBed } from '@angular/core/testing';
import {
  HttpClientTestingModule,
  HttpTestingController
} from '@angular/common/http/testing';

import { EmployService } from './employ-service';
import { Employ } from './employ';

describe('EmployService', () => {

  let service: EmployService;

  let httpMock: HttpTestingController;

  beforeEach(() => {

    TestBed.configureTestingModule({

      imports: [HttpClientTestingModule]

    });

    service = TestBed.inject(EmployService);

    httpMock = TestBed.inject(HttpTestingController);

  });

  afterEach(() => {

    httpMock.verify();

  });

  it('should be created', () => {

    expect(service).toBeTruthy();

  });

  it('should fetch employ list', () => {

    const dummyEmploys: Employ[] = [
      {
        empno: 1,
        name: 'Prasanna',
        gender: 'Male',
        dept: 'Java',
        desig: 'Developer',
        basic: 50000
      },
      {
        empno: 2,
        name: 'Pavithra',
        gender: 'Female',
        dept: 'Angular',
        desig: 'Tester',
        basic: 40000
      }
    ];

    service.showEmploy().subscribe((data) => {

      expect(data.length).toBe(2);

      expect(data).toEqual(dummyEmploys);

    });

    const req = httpMock.expectOne(
      'http://localhost:9991/employ/showemploy'
    );

    expect(req.request.method).toBe('GET');

    req.flush(dummyEmploys);

  });

  it('should search employ by empno', () => {

    const dummyEmploy: Employ = {

      empno: 1,
      name: 'Prasanna',
      gender: 'Male',
      dept: 'Java',
      desig: 'Developer',
      basic: 50000

    };

    service.searchEmploy(1)
      .subscribe((data) => {

        expect(data).toEqual(dummyEmploy);

      });

    const req = httpMock.expectOne(
      'http://localhost:9991/employ/searchEmploy/1'
    );

    expect(req.request.method).toBe('GET');

    req.flush(dummyEmploy);

  });

  it('should add employ', () => {

    const newEmploy: Employ = {

      empno: 3,
      name: 'Naveen',
      gender: 'Male',
      dept: 'React',
      desig: 'Programmer',
      basic: 60000

    };

    service.addEmploy(newEmploy)
      .subscribe((data) => {

        expect(data).toEqual(newEmploy);

      });

    const req = httpMock.expectOne(
      'http://localhost:9991/employ/addEmploy'
    );

    expect(req.request.method).toBe('POST');

    req.flush(newEmploy);

  });

  it('should update employ', () => {

    const employ: Employ = {

      empno: 1,
      name: 'Updated',
      gender: 'Male',
      dept: 'Angular',
      desig: 'Lead',
      basic: 70000

    };

    service.updateEmploy(employ)
      .subscribe((data) => {

        expect(data).toEqual(employ);

      });

    const req = httpMock.expectOne(
      'http://localhost:9991/employ/updateEmploy'
    );

    expect(req.request.method).toBe('PUT');

    req.flush(employ);

  });

  it('should delete employ', () => {

    service.deleteEmploy(1)
      .subscribe((data) => {

        expect(data).toBeTruthy();

      });

    const req = httpMock.expectOne(
      'http://localhost:9991/employ/deleteEmploy/1'
    );

    expect(req.request.method).toBe('DELETE');

    req.flush({});

  });

});